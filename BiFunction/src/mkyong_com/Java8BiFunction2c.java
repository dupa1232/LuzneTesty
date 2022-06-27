package mkyong_com;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Java8BiFunction2c {

    public static void main(String[] args) {
        //2.3 This example converts the above method into a generic method:
        //A lot of possibilities in this generic method, let see:

        // Take two Integers, pow it into a Double, convert Double into a String.
        String result = convert(2,3, (x,y) -> Math.pow(x,y), (z) -> "Pow: " +Double.toString(z)); /// zamiennie String.valueOf(z)
        System.out.println(result); // Pow: 8.0

        // Take two Integers, multiply into an Integer, convert Integer into a String.
        String result2 = convert(3,4, (a,b) -> a*b, c -> "Multiply: " +String.valueOf(c));
        System.out.println(result2); /// Multiply: 12

        // Take two Strings, join both, join "cde"
        String result3 = convert("a", "b", (f,g) -> f+g, h -> h+"cde");
        System.out.println(result3);   /// abcde

        // Take two Strings, join both, convert it into an Integer
        Integer result4 = convert("3","6", (q,w) -> q+w, a->Integer.valueOf(a));
        System.out.println(result4);   ////// 36
    }

    public static <A1, A2, R1, R2> R2 convert(A1 a1, A2 a2,
                                              BiFunction<A1, A2, R1> func,
                                              Function<R1, R2> func2) {
        return func.andThen(func2).apply(a1,a2);
    }
}
