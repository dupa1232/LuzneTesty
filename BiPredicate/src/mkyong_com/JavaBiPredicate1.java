package mkyong_com;

import java.util.function.BiPredicate;

public class JavaBiPredicate1 {
    //1. BiPredicate Hello World.

    public static void main(String[] args) {
        BiPredicate<String, Integer> filter = (x,y) -> x.length() == y;
        // lub
        BiPredicate<String, Integer> filter2 = (x,y) -> {
            return x.length() == y;
        };

        boolean result = filter.test("mkyong", 6);
        System.out.println(result);

        boolean result2 = filter.test("aaa", 5);
        System.out.println(result2);
    }
}
