package mkyong_com;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Java8MethodReference1a {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C");

        // klasa anonimowa
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                SimplePrinter.print(s);
            }
        });

        // lambada
        list.forEach(s -> SimplePrinter.print(s));

        // method reference
        list.forEach(SimplePrinter::print);
    }
}

class SimplePrinter {
    public static void print(String str) {
        System.out.println(str);
    }
}
