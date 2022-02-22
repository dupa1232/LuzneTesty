package strumienieBaeldung;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StrumienieBaeldung {
    //https://www.baeldung.com/java-8-streams-introduction

    public static void main(String[] args) {
        //tworzenie strumienia
        String[] arr = new String[] {"a","b", "c"};
        Stream<String> stream = Arrays.stream(arr);
        stream = Stream.of("a","b", "c");

        List<Integer> asd = Arrays.asList(1,2,3);
        Stream<Integer> strumien = asd.stream();

        // przyk³adowe oepracje na strumieniach
        long a = asd.stream().distinct().count(); //zwróci liczbê elementów unikalnych

        //String do double mapToDouble, a potem toList()
        List<String> asd2 = Arrays.asList("1","2.02","3.99");
        List<Double> strinig = asd2.stream().mapToDouble(x -> Double.parseDouble(x)).boxed().collect(Collectors.toList());
        strinig.stream().forEach(x-> System.out.println(x));
        /*
        1.0
        2.02
        3.99
         */

        // Iterowanie ////////////////////////////////////
        metda(Arrays.asList(arr));
        //powyzsze mozna zastapic strumieniem
        boolean answear = stream.anyMatch(v-> v.contains("a"));
        System.out.println(answear);


        ///// Filtrowanie //////////////////////////////
        ArrayList<String> list = new ArrayList<>();
        list.add("One");
        list.add("OneAndOnly");
        list.add("Derek");
        list.add("Change");
        list.add("factory");
        list.add("justBefore");
        list.add("Italy");
        list.add("Italy");
        list.add("Thursday");
        list.add("");
        list.add("");

        Stream<String> asdd = list.stream().filter(eleme -> eleme.contains("d"));
        asdd.forEach(System.out::println);
        /*
        OneAndOnly
        Thursday
         */
        System.out.println();
        List<String> asddList = list.stream().filter(xxx -> xxx.contains("s")).collect(Collectors.toList());
        asddList.stream().forEach(c -> System.out.println(c));
        /*
        justBefore
        Thursday
         */
        System.out.println();
        asddList.stream().map(x -> { return x+ " abc";}).forEach(s -> System.out.println(s));
        /*
        justBefore abc
        Thursday abc
         */



        /// Mapowanie /////////////////////////////////////////////////// oraz flatMap()
        List<String> urus = new ArrayList<>();
        urus.add("C:\\pobrane");
        Stream<Path> stream1 = urus.stream().map(x -> Paths.get(x));
        //gdy mamy strumien, ktory zawiera w³asn± sekwencje lementow i chcemy utworyc strumien z tych wewnetrznych elementow --- wtedy uzywamy flatMap()
        List<Detail> details = new ArrayList<>();
        details.add(new Detail());
        Stream<String> ditejle = details.stream().flatMap(el -> el.getParts().stream());
//        List<String> ditejle2 = details.stream().flatMap(detail -> detail.getParts().stream()).collect(Collectors.toList()); /// tu leci NPE, bo nie ma zainicjalizowanego nic przeciez
        /////
        System.out.println();
        List<Detail> details1 = new ArrayList<>();
        details1.add(new Detail(Arrays.asList("z","x","c")));
        List<String> asdddd = details1.stream().flatMap(ele -> ele.getParts().stream()).collect(Collectors.toList());
        asdddd.stream().forEach(y -> System.out.println(y));


        /////////////// Matching-owanie /////////////
        boolean isValid = list.stream().anyMatch(x->x.contains("h"));
        System.out.println(isValid); //true
        boolean isValidOne = list.stream().allMatch(x -> x.contains("h"));/// sprawdza, czy wszystkie elementy listy spe³niaj± warunek.Czyli je¶li lista ma obiekty, które maj± pole age i maj± przypisane warto¶ci mniejsze ni¿ 40, to warunek na < 40 w allaMatch zwroci true!
        System.out.println(isValidOne); // false
        boolean isValidTwo = list.stream().noneMatch(x -> x.contains("h"));
        System.out.println(isValidTwo); // false

        System.out.println(Stream.empty().allMatch(Objects::nonNull)); //true
        System.out.println(Stream.empty().anyMatch(Objects::nonNull)); //false


        /////////// Reduction ////////////////////////////////////////////
        //U¿ywane jest do redukcji sekwencji elemtów. Jest metoda reduce(), która przyjmuje dwa parametry: warto¶æ pocz±tkowa oraz sposób redukcji. Przyk³adowo, mamy List<Integer> i chcemy
        //mieæ sumê elementów:
        List<Integer> intigery = Arrays.asList(1,1,1,1);
        System.out.println(intigery.stream().reduce(10,(r,e) -> r+e)); //14

        /////// Collecting /////////////////////////
        //Redukcjê mo¿na równie¿ zapewniæ za pomoc± metody collect() typu Stream. Ta operacja jest bardzo przydatna w przypadku konwersji strumienia do kolekcji (Collection - List, Set) lub Map i
        // reprezentowania strumienia w postaci pojedynczego stringa. Istnieje klasa narzêdziowa (utility class) Collectors, która zapewnia rozwi±zanie dla prawie wszystkich typowych operacji
        // zbierania (collecting operations). W przypadku niektórych, nie trywialnych zadañ, mo¿na utworzyæ niestandardowego Kolekcjonera (Collector).
        List<String> resultList = list.stream().map(x->x.toUpperCase()).collect(Collectors.toList());
        resultList.stream().forEach(System.out::println);
    }
    public static boolean metda(List<String> lista) {
        for(String el : lista) {
            if(el.contains("a"))
                return true;
        }
        return false;
    }
}
class Detail {
    private String part;
    private List<String> parts;
    public Detail()
    {
    }
    public Detail(List<String> asd)
    {
        this.parts = asd;
    }

    public List<String> getParts() {
        return parts;
    }
}
