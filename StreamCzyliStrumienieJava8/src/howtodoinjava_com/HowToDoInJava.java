package howtodoinjava_com;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class HowToDoInJava {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6);
        stream.forEach(s -> System.out.println(s));
        System.out.println();
        //////////////

        Stream<Integer> stream1 = Stream.of(new Integer[]{1,2,3,4});
        stream1.forEach(System.out::println);
        System.out.println();
        //////////////

        List<Integer> list = new ArrayList<>();
        for(int i=1 ; i<6 ; i++) {
            list.add(i);
        }
        list.stream().forEach(x-> System.out.println(x));
        System.out.println();
        ////////////////

        Stream<Integer> randomNumbers = Stream.generate(() -> new Random().nextInt(8));
        randomNumbers.limit(10).forEach(System.out::println);
        System.out.println();
        ///////////////

        IntStream stream2 = "12345_abcdefg".chars();
        stream2.forEach(System.out::println);
        System.out.println();
        /////////////

        Stream<String> stream3 = Stream.of("abcdef".split(""));
        stream3.forEach(System.out::println);
        System.out.println();
        ///////////////

        List<Integer> list1 = new ArrayList<>();
        for (int i=1 ; i<11 ; i++) {
            list1.add(i);
        }
        List<Integer> evenListNumber = list1.stream().filter(x-> x%2 == 0).collect(Collectors.toList());
        evenListNumber.stream().forEach(System.out::println);
        System.out.println();
        ///////////////

        Integer[] arrayInteger = list1.stream().filter(x->x%2 == 0).toArray(Integer[]::new);
        System.out.println(arrayInteger);
        System.out.println();
        //////////////////////////////////////////////////////////////////////////////////////
        /////////////////// intermediate operations //////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////

        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");
        memberNames.stream().filter(s -> s.startsWith("A")).forEach(System.out::println);
        System.out.println();
        //////////////////

        memberNames.stream().filter(s->s.startsWith("A")).map(String::toUpperCase).forEach(System.out::println);
        System.out.println();
        /////////////////

        memberNames.stream().sorted().map(x -> x.toUpperCase()).forEach(System.out::println); /// tu siê te¿ da w³asny Comparator do .sort() stworzyæ!

        System.out.println("TERMINUJACEEEEEEEEEEE");
        //////////////////////////////////////////////////////////////////////////////////////
        /////////////////// terminal operations //////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////
        List<String> memNamesInUpperCase = memberNames.stream().sorted().map(String::toUpperCase).collect(Collectors.toList());
        memNamesInUpperCase.stream().forEach(System.out::println);
        System.out.println();
        ////////////////

        boolean matchedResult = memberNames.stream().anyMatch(x -> x.startsWith("A"));
        System.out.println(matchedResult); //true
        System.out.println(memberNames.stream().allMatch(s->s.startsWith("A"))); //false
        System.out.println(memberNames.stream().noneMatch(s->s.startsWith("A")));//false
        ////////////////

        long totalMatched = memberNames.stream().filter(s->s.startsWith("A")).count();
        System.out.println(totalMatched); //2
        ////////////////

        Optional<String> reduced = memberNames.stream().reduce((a,b) ->a+";"+b);
        reduced.ifPresent(System.out::println); //Amitabh;Shekhar;Aman;Rahul;Shahrukh;Salman;Yana;Lokesh
        ////////////////


        //////////////////////////////////////////////////////////////////////////////////////
        /////////////////// short-circuit operations /////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////
        System.out.println(memberNames.stream().anyMatch(s->s.startsWith("A"))); // true

        System.out.println(memberNames.stream().findFirst()); // Optional[Amitabh]
        memberNames.stream().findFirst().ifPresent(System.out::println); // Amitabh
        System.out.println(memberNames.stream().filter(s->s.startsWith("L")).findFirst()); //Optional[Lokesh]
        System.out.println(memberNames.stream().filter(s->s.startsWith("L")).findFirst().get()); // Lokesh


        //////////////////////////////////////////////////////////////////////////////////////
        /////////////////// parallel Streams /////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////
        List<Integer> list2 = new ArrayList<>();
        for(int i=0 ; i<1000000 ; i++) {
            list2.add(i);
        }
        Integer[] parzyste = list2.parallelStream().filter(x->x%2==0).toArray(Integer[]::new);
        System.out.println(parzyste);

        /// porównanie czasowo¶ci parallel i nieparallel stream
        long startNotParallel = System.currentTimeMillis();
        Integer[] parzyste2 = list2.stream().filter(x->x%2==0).toArray(Integer[]::new);
        long stopNotParallel = System.currentTimeMillis();
        System.out.println(stopNotParallel-startNotParallel);

        long startParallel = System.currentTimeMillis();
        Integer[] parzyste3 = list2.parallelStream().filter(x->x%2==0).toArray(Integer[]::new);
        long stopParallel = System.currentTimeMillis();
        System.out.println(stopParallel-startParallel);
        // ogólnie robi szybciej równoleg³y strumieñ - có¿ za przypadek - czasem jest to stosunek 10:30, czasem 32:50 (milisekund)
    }
}
