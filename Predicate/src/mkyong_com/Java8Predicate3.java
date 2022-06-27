package mkyong_com;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Java8Predicate3 {

    //3. Predicate.or()

    public static void main(String[] args) {

        ////// double filter
        List<String> list = Arrays.asList("A", "AA", "AAA", "B", "BB", "BBB");

        List<String> result = list.stream().filter(x->x.length() == 3 || x.startsWith("A")).collect(Collectors.toList());
        System.out.println(result); //// [A, AA, AAA, BBB]


        ///////// double Predicate
        Predicate<String> lengthIs3 = x -> x.length() == 3;
        Predicate<String> startsWithA = z -> z.startsWith("A");
        List<String> result2 = list.stream().filter(lengthIs3.or(startsWithA)).collect(Collectors.toList());
        System.out.println(result2); ///// [A, AA, AAA, BBB]
    }
}
