package mkyong_com;

import java.util.function.Consumer;

public class Java8Consumer1 {

    //1. Consumer
    public static void main(String[] args) {
        Consumer<String> konsumer = x -> System.out.println(x);
        konsumer.accept("dupa"); // dupa
    }
}
