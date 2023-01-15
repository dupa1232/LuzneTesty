package sheBang.konsumenci;

import sheBang.interfejsFunkcyjny.Perosn;

import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        Consumer<Perosn> greeter = p -> System.out.println("Hello " + p.getFirstName());
        greeter.accept(new Perosn("jacek", "placek")); /// wy¶wietli ->> Hello jacek

    }
}
