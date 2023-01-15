package sheBang.dostawcy;

import sheBang.interfejsFunkcyjny.Perosn;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<Perosn> perosnSupplier = Perosn::new;
        perosnSupplier.get();           //// zwróci po prostu -> new Person();
    }
}
