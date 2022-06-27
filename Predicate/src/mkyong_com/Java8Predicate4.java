package mkyong_com;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Java8Predicate4 {
    //4. Predicate.negate()
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "AA", "AAA", "B", "BB", "BBB");

        // lamba version
        List<String> result = list.stream().filter(x->!x.startsWith("A")).collect(Collectors.toList());
        System.out.println(result);

        /// predicate - negate
        Predicate<String> predicate = z -> z.startsWith("A");
        List<String> result2 = list.stream().filter(predicate.negate()).collect(Collectors.toList());
        System.out.println(result2);
    }
}
