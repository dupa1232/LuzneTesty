package StrumienieBaeldung2;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.*;

//https://www.baeldung.com/java-8-streams

public class StrumienieBaeldung2 {
    static int counter =0;
    public static void main(String[] args) throws IOException {
        // utworzenie pustem strumienia
        Stream<String> emptyStream = Stream.empty();

        //Stream of collection
        Stream<String> streamOfArray = Stream.of("a","b","c");
        // mo¿na te¿ na podstawie istniej±cej tablicy zrobiæ strumieñ lub z jej czê¶ci
        String[] arr = new String[] {"a","b","c"};
        Stream<String> streamOfArrayFull = Arrays.stream(arr);
        Stream<String> streamOfArrayPart = Arrays.stream(arr,1,3);
        streamOfArrayPart.forEach(System.out::println); // wydrukuje: b c

        //Stream.builder()
        Stream<String> streamBuilder = Stream.<String>builder().add("a").add("b").build();

        //Stream.iterate()
        Stream<Integer> streamInteger = Stream.iterate(40, n -> n+2).limit(20);
        streamInteger.forEach(s-> System.out.print(s + "; ")); // wydrukuje 20 liczb, od 40, co 2, czyli: 40; 42; 44;....

        //Stream of primitives
        IntStream intStream = IntStream.range(1,5);
        LongStream longStream = LongStream.rangeClosed(1,4);

        System.out.println();
        Random random = new Random();
        DoubleStream doubleStream = random.doubles(3);
        doubleStream.forEach(System.out::println);

        //Stream of file
        Path path = Paths.get("C:\\Users\\User\\Desktop\\textTest.txt");
        Stream<String> asd = Files.lines(path);
        asd.forEach(s-> System.out.println(s));// wydrukuje zawartosc pliku textTest.txt
        Stream<String> asdWithCharset = Files.lines(path, Charset.forName("UTF-8"));



        ///// Referencing a stream
        Stream<String> streamm = Stream.of("a","b","c").filter(el -> el.contains("a"));
        Optional<String> anyElement = streamm.findAny();
        System.out.println(anyElement);
        //Optional<String> fyrstElement = streamm.findFirst(); // takie wywo³anie, gdy wcze¶niej by³a wywo³ana operacja koñcz±ca .findAny(), rzuci IllegalStateException, bo .findAny() te¿ jest operacj± koñcz±c±
        //¿eby powy¿sze dzia³a³o, to trzeba to tak zrobiæ:
        List<String> streamss = Stream.of("a", "b", "c").filter(a -> a.contains("b")).collect(Collectors.toList());
        Optional<String> strumien1 = streamss.stream().findAny();
        Optional<String> strumien2 = streamss.stream().findFirst();


        //Stream Pipeline
        Stream<String> strumienPipeline = Stream.of("abc", "def", "ghi").skip(1);
        Stream<String> strumienPipeline2 = Stream.of("abc", "def", "ghi").skip(1).map(ele -> ele.substring(0,2));
        System.out.println("zzzzzzzzz ");
        strumienPipeline2.forEach(System.out::println);
        System.out.println("ccccccccccc");

        long size = Stream.of("abc1", "abc2", "abc3","abc4").skip(1).map(ele -> ele.substring(0,2)).sorted().count();
        System.out.println(size); // 3 zwróci

        //Lazy invocation --- ogólnie, jest to pojebane i ciê¿kie do zrozumienia, ta kolejno¶æ wywo³añ
        List<String> listraDlaStrumienia = Arrays.asList("abc1", "abc2", "abc3");
        Stream<String> asss = listraDlaStrumienia.stream().filter(el -> {
            wasCalled();
            return el.contains("2");
        });

        Optional<String> streammm = listraDlaStrumienia.stream().filter(element -> {
            System.out.println("filter() was called");
            return element.contains("2");
        }).map(element -> {
            System.out.println("map() was called");
            return element.toUpperCase();
        }).findFirst();
        /*
        Wydrukuje:
        filter() was called
        filter() was called
        map() was called
         */

        Stream<String> asdd = Stream.of("a","b", "c").filter(x->x.contains("a"));
        asdd.forEach(System.out::println);


        ////// Order of execution
        List<String> aaaaa = Arrays.asList("abc1", "abc2", "abc3", "abc4", "abc5");
        long sizee = aaaaa.stream().map(el -> {
            wasCalled();
            return el.substring(0,3);
        }).skip(2).count();
        System.out.println(sizee);

        counter = 0;
        aaaaa.stream().map(el -> {
            wasCalled();
            return el.substring(0,3);
        }).forEach(x-> System.out.println(x));
        /*
        zwróci:
        1
        abc
        2
        abc
        3
        abc
        4
        abc
        5
        abc
         */

        System.out.println("xxxxxxxxx");
        counter = 0;
        aaaaa.stream().map(el -> {
            wasCalled();
            if(el.contains("2"))
                return el.substring(0,3);
            else
                return el.substring(0,2);
        }).forEach(x-> System.out.println(x));
        /*
        zwróci:
        1
        ab
        2
        abc
        3
        ab
        4
        ab
        5
        ab
         */
        counter=0;
        System.out.println("\\\\\\");
        long sizeee = aaaaa.stream().skip(2).map(element -> {
            wasCalled();
            return element.substring(0,3);
        }).count();
        System.out.println("zxczxczxczxc");
        System.out.println(sizeee);
        /*
        1
        2
        3
        zxczxczxczxc
        3
         */

        System.out.println("xxxxxx");
        /// Stream reduction
        OptionalInt reduced = IntStream.range(1,5).reduce((a,b) -> a+b);
        System.out.println(reduced);
        //powy¿sze zwróci ->>> OptionalInt[10]

        //////
        System.out.println(IntStream.range(1,5).reduce(10,(a,b) -> (a+b)));
        //zwroci - 20

        int lvWynik = Arrays.asList(1,2,3,4).stream().reduce(10, (a,b) -> a+b,(a,b) -> {
            System.out.println("ccccccccccccc");
            return a+b;
        });
        System.out.println(lvWynik +" ---- lvWynikk");
        /// te¿ zwróci 20. Powy¿sze, te¿ zwróci³o 20, jak przedostatnie. ¯eby combiner zadzia³a³ i wy¶wietli³ "ccccccccc", to trzeba u¿yæ parallelStream, czyli:
        int lvWynik2 = Arrays.asList(1,2,3,4).parallelStream().reduce(10, (a,b) -> a+b,(a,b) -> {
            System.out.println("ccccccccccccc -- " +(a+b));
            return a+b;
        });
        System.out.println(lvWynik2 +" **** lvwynik2");
        /*
        zwróci powy¿sze:
        ccccccccccccc -- 23
        ccccccccccccc -- 27
        ccccccccccccc -- 50
        50 **** lvwynik2
         */

        int reducedParallel = Arrays.asList(1, 2, 3).parallelStream()
                .reduce(10, (a, b) -> a + b, (a, b) -> {
                    System.out.println("combiner was called - " +(a+b));
                    return a + b;
                });
        System.out.println(reducedParallel);
        /*
        Wynik tutaj jest inny (36), a sumator (combiner) zosta³ wywo³any dwukrotnie. Tutaj redukcja dzia³a wed³ug nastêpuj±cego algorytmu: akumulator uruchomi³ siê trzy razy,
        dodaj±c ka¿dy element strumienia do identity. Te dzia³ania s± wykonywane równolegle. W rezultacie maj± (10 + 1 = 11; 10 + 2 = 12; 10 + 3 = 13;).
        Teraz sumator mo¿e po³±czyæ te trzy wyniki. Potrzebuje do tego dwóch iteracji (12 + 13 = 25; 25 + 11 = 36).
         */

        //wylistowanie warto¶ci int i zwrócenie do kolekcji\
        IntStream.range(1,5).boxed().collect(Collectors.toList()).forEach(x->System.out.print(x+", "));

        //// The collect() Method ///////////////
        List<Product> productList = Arrays.asList(new Product(23, "potatoes"),
                new Product(14, "orange"), new Product(13, "lemon"),
                new Product(23, "bread"), new Product(13, "sugar"));

        List<String> listOfNames = productList.stream().map(Product::getName).collect(Collectors.toList());

        System.out.println();
        String lisToString = productList.stream().map(Product::getName).collect(Collectors.joining(",", "/", "\\"));
        System.out.println(lisToString);
        //obliczenie ¶redniej z liczb
        double avgStremNumber = productList.stream().collect(Collectors.averagingInt(Product::getNumber));
        System.out.println(avgStremNumber);
        //suma liczb
        int summedInt = productList.stream().collect(Collectors.summingInt(Product::getNumber));
        System.out.println(summedInt);

        // jak szybko pobraæ statystyki nt. liczb z danej listy
        IntSummaryStatistics statistics = productList.stream().collect(Collectors.summarizingInt(Product::getNumber));
        System.out.println(statistics);
        /*
        zwróci:
        IntSummaryStatistics{count=5, sum=86, min=13, average=17,200000, max=23}
         */

        //strumieñ zosta³ zredukowany do Mapy, która grupuje wszystkie produkty wed³ug ich ceny
        Map<Integer, List<Product>> collectorMapOfLists = productList.stream().collect(Collectors.groupingBy(Product::getNumber));
        System.out.println(collectorMapOfLists);

        //Podzia³ elementów strumienia na grupy wed³ug jakiego¶ predykatu:
//        Map<Boolean, List<String>> adsdd = productList.stream().collect(Collectors.partitioningBy(ele -> ele.getNumber > 15));

        //"popychanie" Collector-a do wykonywania dodatkowych operacji
        Set<Product> unmodifibleShit = productList.stream().collect(Collectors.collectingAndThen(Collectors.toSet(), Collections::unmodifiableSet));
        Set<Product> unmodfi = productList.stream().collect(Collectors.toUnmodifiableSet()); // to te¿ dzia³a i przerabia chyba jak to powy¿sze
        /*
        W tym konkretnym przypadku kolektor przekszta³ci³ strumieñ w zestaw, a nastêpnie utworzy³ z niego niezmienny zestaw.
         */

        //// Custom collector
        Collector<Product, ?, LinkedList<Product>> toLinkedList =
                Collector.of(LinkedList::new, LinkedList::add,
                        (first, second) -> {
                    first.addAll(second);
                    return first;
                        });
        LinkedList<Product> linkedListOfPersons = productList.stream().collect(toLinkedList);

        ////Parallel Streams ///////////////////////////////////////////////////////////////////
        Stream<Product> streamOfCollection = productList.parallelStream();
        boolean isParallel = streamOfCollection.isParallel();
        boolean bigPrice = streamOfCollection
                .map(product -> product.getNumber() * 12)
                .anyMatch(price -> price > 200);

        IntStream intStreamParallel = IntStream.range(1, 150).parallel();
        boolean isParallell = intStreamParallel.isParallel();

        IntStream intStreamSequential = intStreamParallel.sequential();
        boolean isParallelll = intStreamSequential.isParallel();



    }

    private static void wasCalled() {
        counter++;
        System.out.println(String.valueOf(counter));
    }

    static class Product
    {
        private Integer number;
        private String name;

        public Product(Integer number, String name)
        {
            this.number = number;
            this.name = name;
        }

        public Integer getNumber() {
            return number;
        }

        public void setNumber(Integer number) {
            this.number = number;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
