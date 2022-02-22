package inneStrumyki;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class Outer {
    Nested nested;
}

class Nested {
    Inner inner;
}

class Inner {
    String foo;
}

public class FlatMap2 {
    public static void main(String[] args) {

        Outer outer = new Outer();
        if (outer != null && outer.nested != null && outer.nested.inner != null) {
            System.out.println(outer.nested.inner.foo);
        }
        /// powy¿sze mo¿na zast±piæ Optional-em
        Optional.of(new Outer())
                .flatMap(o -> Optional.ofNullable(o.nested))
                .flatMap(n -> Optional.ofNullable(n.inner))
                .flatMap(i -> Optional.ofNullable(i.foo))
                .ifPresent(System.out::println);


        List<Person> persons =
                Arrays.asList(
                        new Person("Max", 18),
                        new Person("Peter", 23),
                        new Person("Pamela", 23),
                        new Person("David", 12));
        persons.stream().reduce((x,y) -> x.age < y.age ? x:y).ifPresent(System.out::println); //David

        ///// Inny przyk³ad reduce() - ale tym raze z sumowaniem
        Person person = persons.stream().reduce(new Person("", 0), (p1,p2) -> {
            p1.age += p2.age;
            p1.name += p2.name;
            return p1;
        });
        System.out.println(person.age +" -- - - " +person.name); // 76 -- - - MaxPeterPamelaDavid

        /////////////////////////////////
        Integer ageSum = persons.stream()
                .reduce(0, (sum,p) -> sum += p.age, (sum1, sum2) -> sum1 + sum2);
        System.out.println(ageSum); // 76

        ////// powy¿sze, ale bardziej rozpisane
        Integer ageSum2 = persons.stream()
                .reduce(0,(sum, p) -> {
                    System.out.format("akumulator sum = %s, p = %s\n", sum,p);
                    return sum += p.age;
                },
                        (sum1,sum2) -> {
                            System.out.format("combiner sum1 = %s, sum2 = %s\n", sum1,sum2);
                            return sum1 + sum2;
                });
        /*
        akumulator sum = 0, p = Max
        akumulator sum = 18, p = Peter
        akumulator sum = 41, p = Pamela
        akumulator sum = 64, p = David
         */
        // Wygl±da, jakby combiner nie by³ w ogóle u¿ywany. Wykonanie powy¿szego z u¿yciem parallelStream() pozwoli rozwik³aæ tajemnicê:
        System.out.println();
        Integer parallelAge = persons.parallelStream()
                .reduce(0, (sum, p) -> {
                    System.out.format("accumulator sum %s, p - %s\n", sum, p.name);
                    return sum+=p.age;
                },
                        (sum1, sum2) -> {
                            System.out.format("combiner sum1 - %s; sum2 - %s\n", sum1, sum2);
                            return sum1 + sum2;
                        });
        /*
        accumulator sum 0, p - Pamela
        accumulator sum 0, p - David
        combiner sum1 - 23; sum2 - 12
        accumulator sum 0, p - Max
        accumulator sum 0, p - Peter
        combiner sum1 - 18; sum2 - 23
        combiner sum1 - 41; sum2 - 35
         */
    }
}
