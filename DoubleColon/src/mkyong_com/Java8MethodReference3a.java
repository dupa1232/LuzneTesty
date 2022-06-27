package mkyong_com;

import java.util.function.BiPredicate;
import java.util.function.Function;

public class Java8MethodReference3a {
    public static void main(String[] args) {

        //3. Reference to an instance method of an arbitrary object of a particular type.

        ///////// lamba
        int result = playOneArgument("dupa", x -> x.length());
        ///////// method reference
        int result2 = playOneArgument("dupa", String::length);

        ///////// lamba
        Boolean result3 = playTwoArgument("dupa", "u", (a,b) -> a.contains(b));
        ///////// method reference
        Boolean result4 = playTwoArgument("dupa", "u", String::contains);

        ///////// lamba
        Boolean result5 = playTwoArgument("dupa", "2", (a,b) -> a.startsWith(b));
        ///////// method reference
        Boolean result6 = playTwoArgument("dupa", "2", String::startsWith);
    }

    static <R> R playOneArgument(String s, Function<String, R> func) {
        return func.apply(s);
    }

    static Boolean playTwoArgument(String s1, String s2, BiPredicate<String, String> func) {
        return func.test(s1,s2);
    }
}
