package sheBang.funkcje;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String, Integer> toInteger = Integer::valueOf;
        Function<String, String> backToString = toInteger.andThen(String::valueOf);

        Integer integer = toInteger.apply("22");
        System.out.println(integer + " --- " +integer.getClass());                  // 22 --- class java.lang.Integer

        System.out.println(backToString.apply("233"));                           // 233

        /// /moje
        Function<String, Character> getFirstChar = x -> x.charAt(0);
        System.out.println(getFirstChar.apply("dupaaa"));                        // d
    }
}
