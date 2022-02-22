package inneStrumyki;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class AdvancedOperations {

    public static void main(String[] args) {
        List<Person> persons =
                Arrays.asList(
                        new Person("Max", 18),
                        new Person("Peter", 23),
                        new Person("Pamela", 23),
                        new Person("David", 12));
        List<Person> filteredSzit = persons.stream().filter(p -> p.name.startsWith("P")).collect(Collectors.toList());
        filteredSzit.stream().forEach(System.out::println);

        /// Collectors.groupingBy()
        Map<Integer, List<Person>> personsByAge = persons.stream().collect(Collectors.groupingBy(p -> p.age));
        personsByAge.forEach((age, p) -> System.out.format("age = %d ; name = %s -- ", age, p));

        /// Collectors.averagingInt()
        System.out.println();
        Double averageAge = persons.stream().collect(Collectors.averagingInt(x -> x.age));
        System.out.println(averageAge);

        IntSummaryStatistics summary = persons.stream().collect(Collectors.summarizingInt(p -> p.age));
        System.out.println(summary); ///IntSummaryStatistics{count=4, sum=76, min=12, average=19,000000, max=23}

        //Przydatne w klejeniu warunku IN w sql:
        System.out.println(); ///£±czenie w jeden string
        System.out.println(persons.stream().filter(p -> p.age >= 18).map(p -> p.name).collect(Collectors.joining(" " +
                "and ", "W polszy ", " s± w legalnym wieku")));// W polszy Max and Peter and Pamela s± w legalnym wieku

        Map<Integer, String> mapa = persons.stream().collect(Collectors.toMap(
                p -> p.age,
                p -> p.name.toUpperCase(),
                (p1,p2) -> p1 + " ; " + p2
        ));
        System.out.println(mapa); //{18=MAX, 23=PETER ; PAMELA, 12=DAVID}

        Collector<Person, StringJoiner, String> kolektor =
                Collector.of(
                        () -> new StringJoiner(" | "), //supplier
                        (j, p) -> j.add(p.name.toUpperCase()), //accumulator
                        (x,y) -> x.merge(y),                   //combiner
                        StringJoiner::toString);               //finisher
        System.out.println(persons.stream().collect(kolektor)); //MAX | PETER | PAMELA | DAVID


        ///////////////// FlatMap ////////////////////////////////////////////////////////////////////////////////////////////////////////////

    }
}
