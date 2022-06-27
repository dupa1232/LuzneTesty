package mkyong_com;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Java8BiFunction2b {

    public static void main(String[] args) {
        /// This example converts the above program (??? Java8BiFunction2a.java ???) into a method that accepts BiFunction and Function as arguments and chains it together.

        String result = powToString(2,4,
                (x1,x2) -> Math.pow(x1, x2),
                (r) -> "Result: " +String.valueOf(r));

        System.out.println(result); /// Result: 16.0
    }

    public static <R> R powToString(Integer a1, Integer a2, BiFunction<Integer, Integer, Double> func, Function<Double, R> func2) {
        return func.andThen(func2).apply(a1, a2);
    }
}
