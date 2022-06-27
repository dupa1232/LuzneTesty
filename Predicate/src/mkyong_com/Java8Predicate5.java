package mkyong_com;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Java8Predicate5 {
    /// 5. Predicate.test() in function

    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "AA", "AAA", "B", "BB", "BBB");

        System.out.println(StringPredicate.filter(list, x -> x.startsWith("A")));

        System.out.println(StringPredicate.filter(list, z -> z.startsWith("A") && z.length() > 2));
    }

}

class StringPredicate {
    static List<String> filter(List<String> list, Predicate<String> predicate) {
        return list.stream().filter(predicate::test).collect(Collectors.toList());
    }
}
