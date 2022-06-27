package mkyong_com;

import java.util.function.Function;


// This example takes a <T> String and returns the length of the string as <R> Integer.
public class JavaMoney {

    public static void main(String[] args) {
        Function<String, Integer> func = x->x.length();
        Integer apply = func.apply("dupa");
        System.out.println(apply); // 4
    }
}
