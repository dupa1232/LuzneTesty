package mkyong_com;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Java8Consumer3 {

    //2.2 Same forEach method to accept Consumer as an argument; this time, we will print the length of the string.

    public static void main(String[] args) {
        Consumer<String> connn = x -> System.out.println(x.length());
        List<String> list = Arrays.asList("a", "ab", "abc");
        /// wykorzystanie zdefiniowanego wyzej konsujmera
        forIcz(list, connn);
        System.out.println("xxxxxxxxxx");
        /// wykorzystanie konsjumera definiowanego tutaj
        forIcz(list, x -> System.out.println(x.length()));
        System.out.println("xxxxxxxxxx");
        forIcz(list, (String x) -> System.out.println(x.length()));
    }

    static <T> void forIcz(List<T>lita, Consumer<T> con) {
        for(T t : lita) {
            con.accept(t);
        }
    }
}
