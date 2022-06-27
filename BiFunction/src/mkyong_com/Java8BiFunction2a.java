package mkyong_com;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Java8BiFunction2a {
    public static void main(String[] args) {

        //2.1 This BiFunction takes two Integer and returns a Double, and uses andThen() to chain it with a Function to convert the Double into a String.
        //Math.pow(a1, a2) return Double
        BiFunction<Integer, Integer, Double> biFunc = (a1, a2) -> Math.pow(a1,a2);

        //tales Double return String
        Function<Double, String> func = a -> Double.toString(a);

        String result = biFunc.andThen(func).apply(3,2);
        System.out.println(result); /// 9.0 jako string

        ///////////// mój sposób
        String result3 = func.apply(biFunc.apply(2,3));
        System.out.println(result3); // 8.0 (jako string)
    }
}
