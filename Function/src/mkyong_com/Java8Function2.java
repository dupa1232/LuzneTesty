package mkyong_com;

import java.util.function.Function;


///This example chains the Function with andThen().
public class Java8Function2 {
    public static void main(String[] args) {

        Function<String, Integer> function = x -> x.length();
        Function<Integer, Integer> function2 = s -> s*2;

        Integer result = function.andThen(function2).apply("dupa");
        System.out.println(result); // 8
    }
}
