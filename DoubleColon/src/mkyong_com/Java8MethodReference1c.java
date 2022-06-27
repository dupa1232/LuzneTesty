package mkyong_com;

import java.util.function.BiFunction;

public class Java8MethodReference1c {

    public static void main(String[] args) {
        /*
        This example joins two Integer and returns a String. It passes a method reference static method IntegerUtils::join as an argument into another method that accepts a BiFunction.
         */

        /// klasa anonimowa
        String result1 = playTwoArgument(1, 2, new BiFunction<Integer, Integer, String>() {
            @Override
            public String apply(Integer integer, Integer integer2) {
                return IntegerUtils.join(integer, integer2);
            }
        });
        System.out.println(result1);


        //// lambady
        String result2 = playTwoArgument(1,2,(a,b) -> IntegerUtils.join(a,b));

        // method reference
        String result3 = playTwoArgument(1,2, IntegerUtils::join);

    }

    private static <R> R playTwoArgument(Integer i1, Integer i2, BiFunction<Integer, Integer, R> func) {
        return func.apply(i1,i2);
    }
}

class IntegerUtils {
    public  static String join(Integer a, Integer b) {
        return String.valueOf(a+b);
    }
}
