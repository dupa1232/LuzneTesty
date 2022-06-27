package mkyong_com;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Java8Consumer2 {

    //2. Higher Order Function
    // 2.1 This example accepts Consumer as an argument, simulates a forEach to print each item from a list.
    public static void main(String[] args) {
        Consumer<String> konsjumer  = x -> System.out.println(x);
        List<String> listaa = Arrays.asList("1","2","3","4","5","6","7");

        /// wykorzystanie zdefiniowanego wyzej konsumera
        forIcz(listaa, konsjumer);

        /// definiowanie konsjumera podczas wywo³ywania metody
        forIcz(listaa, x -> System.out.println(x+ " - dupaaa"));
    }

    static <T> void forIcz(List<T> list, Consumer<T> konsjumer) {
        for(T t : list) {
            konsjumer.accept(t);
        }
    }
}
