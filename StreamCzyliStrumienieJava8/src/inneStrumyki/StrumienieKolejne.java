package inneStrumyki;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StrumienieKolejne {
    public static void main(String[] args) {
        //// na podstawie https://winterbe.com/posts/2014/07/31/java8-stream-tutorial-examples/

        Arrays.asList("a", "v", "c").stream().findFirst().ifPresent(System.out::println); /// a

        Stream.of(1,3,2).findFirst().ifPresent(System.out::println); // 1

        IntStream.range(1,4).forEach(x-> System.out.print(x+",")); //1,2,3,

        System.out.println();
        //https://www.geeksforgeeks.org/intstream-generate-method-java/
        IntStream intStream = IntStream.generate(() -> {
            return (int)(Math.random()*10000);
        });
        intStream.limit(4).forEach(x-> System.out.print(x+ ",")); // 8119,7053,5387,8853, ---- cztery randomowe liczby zwraca
        //https://www.geeksforgeeks.org/intstream-generate-method-java/

        // dzia³anie na prymitywach int
        System.out.println();
        Arrays.stream(new int[] {1,3,2}).map(x -> x*2+1).average().ifPresent(System.out::println); // 5.0

        Stream.of(new String[] {"a1","a2","a3"}).map(str -> str.substring(1)).mapToInt(Integer::parseInt).max().ifPresent(System.out::println); /// 3
        // dzia³anie na prymitywach int
        IntStream.range(1,5).mapToObj(a-> "a" +a).forEach(x-> System.out.print(x+", ")); //a1, a2, a3, a4,

        // dzia³anie na prymitywach double
        System.out.println();
        Stream.of(1.0, 2.0, 3.0).mapToInt(Double::intValue).mapToObj(x -> "a"+x).forEach(x-> System.out.print(x+ ", ")); //a1, a2, a3,


        ////// Processing order
        Stream.of("d2", "a2", "b1", "b3", "c")
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return true;
                })
                .forEach(s -> System.out.println("forEach: " + s));
        //powy¿sze spowoduje wy¶wietlenie
        /*
        filter:  d2
        forEach: d2
        filter:  a2
        forEach: a2
        filter:  b1
        forEach: b1
        filter:  b3
        forEach: b3
        filter:  c
        forEach: c
         */
        System.out.println();
        System.out.println();
        Stream.of("d2", "a2", "b1", "b3", "c")
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .anyMatch(s -> {
                    System.out.println("anyMatch: " + s);
                    return s.startsWith("A");
                });
        // map:      d2
        // anyMatch: D2
        // map:      a2
        // anyMatch: A2

        /// Why order matters
        Stream.of("d2", "a2", "b1", "b3", "c")
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return s.startsWith("A");
                })
                .forEach(s -> System.out.println("forEach: " + s));

        // map:     d2
        // filter:  D2
        // map:     a2
        // filter:  A2
        // forEach: A2
        // map:     b1
        // filter:  B1
        // map:     b3
        // filter:  B3
        // map:     c
        // filter:  C

        System.out.println();
        List<Integer> asd = Arrays.asList(3,4,2,5);
        asd.stream()
                .map(s ->
                    s*s
                )
                .filter(s ->
                   s>10
                )
                .forEach(s -> System.out.print("forEach: " + s+ ", "));
        //forEach: 16, forEach: 25,



        /////sorted
        Stream.of("d2", "a2", "b1", "b3", "c")
                .sorted((s1, s2) -> {
                    System.out.printf("sort: %s; %s\n", s1, s2);
                    return s1.compareTo(s2);
                })
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return s.startsWith("a");
                })
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .forEach(s -> System.out.println("forEach: " + s));

        //sort:    a2; d2
        //sort:    b1; a2
        //sort:    b1; d2
        //sort:    b1; a2
        //sort:    b3; b1
        //sort:    b3; d2
        //sort:    c; b3
        //sort:    c; d2
        //filter:  a2
        //map:     a2
        //forEach: A2
        //filter:  b1
        //filter:  b3
        //filter:  c
        //filter:  d2


        Stream.of("d2", "a2", "b1", "b3", "c")
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return s.startsWith("a");
                })
                .sorted((s1, s2) -> {
                    System.out.printf("sort: %s; %s\n", s1, s2);
                    return s1.compareTo(s2);
                })
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .forEach(s -> System.out.println("forEach: " + s));

        // filter:  d2
        // filter:  a2
        // filter:  b1
        // filter:  b3
        // filter:  c
        // map:     a2
        // forEach: A2


        System.out.println();
        Stream.of("d2", "a2", "b1", "a3","b3", "c")
                .filter(s -> s.startsWith("a"))
                .sorted((s1, s2) -> (s1.compareTo(s2)))
                .map(s -> s.toUpperCase())
                .forEach(s -> System.out.print("forEach: " + s+ " , ")); //forEach: A2 , forEach: A3 ,


        ///// Reusing Streams
        System.out.println();
        Stream<String> stream =
                Stream.of("d2", "a2", "b1", "b3", "c")
                        .filter(s -> s.startsWith("a"));
        stream.anyMatch(s -> true);    // ok
//        stream.noneMatch(s -> true);   // exception


        // wywo³ywanie kilka operacji koñcz±cych na (teoretycznie) tym samym strumieniu
        Supplier<Stream<String>> streamm = () -> Stream.of("d2", "a2", "b1", "b3", "c")
                .filter(s -> s.startsWith("a"));
        streamm.get().anyMatch(s -> true);
        streamm.get().noneMatch(s -> true);
    }
}
