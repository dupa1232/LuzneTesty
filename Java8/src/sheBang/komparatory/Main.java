package sheBang.komparatory;

import sheBang.interfejsFunkcyjny.Perosn;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Comparator<Perosn> comparator = (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName());
        Perosn perosn1 = new Perosn("John", "Doe");
        Perosn perosn2 = new Perosn("Alice", "Doe");
        Perosn perosn3 = new Perosn("Jaceh", "Doe");

        System.out.println(comparator.compare(perosn1, perosn2));
        System.out.println(comparator.compare(perosn2, perosn1));
        System.out.println(comparator.compare(perosn1, perosn1));

        System.out.println(comparator.reversed().compare(perosn1, perosn2));
        System.out.println(comparator.compare(perosn1, perosn3));

        /*
        Wy¶wietli:
        9
        -9
        0
        -9
        14
        Czyli wy¶wietla odleg³o¶æ tych liter
         */
    }
}
