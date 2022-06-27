package mkyong_com;

import java.util.function.Predicate;

public class Java8Predicate6 {

    // 6. Predicate Chaining

    public static void main(String[] args) {
        Predicate<String> startWithA = x -> x.startsWith("a");

        // start with 'a' or 'm'
        boolean result = startWithA.or(z -> z.startsWith("m")).test("ass");
        System.out.println(result);

        // start with "a" and length is 3
        boolean result2 = startWithA.and(c -> c.length() == 3).test("zxc");
        System.out.println(result2);
    }
}
