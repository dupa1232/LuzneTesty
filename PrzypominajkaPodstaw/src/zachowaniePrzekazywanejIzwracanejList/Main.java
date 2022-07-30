package zachowaniePrzekazywanejIzwracanejList;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Klasa klasa = new Klasa();
        List<Integer> wynik = klasa.metoda1();
        wynik = klasa.metoda2(wynik);
        wynik.stream().forEach(System.out::println);
    }
}
