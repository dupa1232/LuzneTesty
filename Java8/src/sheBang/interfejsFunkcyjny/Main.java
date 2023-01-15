package sheBang.interfejsFunkcyjny;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        /// czyli tu implementujemy zachowanie tej metody
        InterfejsFunkcyjny<String, Integer> konwerter = (from) -> Integer.valueOf(from);
        Integer asd = konwerter.convert("2");
        System.out.println(asd);

        System.out.println(konwerter.doingSthDifferent());
        /*
        * wy¶wietli:
            2
            HI bitches, I am default method from Functional Interface!
        * */
////////////////////////////////////////////////////////////////////////////////////////
        InterfejsFunk2 interfejsFunk = (x,y) -> (String)x+y;
//        interfejsFunk.zwrocJakoString(2,3); ClassCastException zwraca
        System.out.println(interfejsFunk.zwrocJakoString("2", "33"));
        InterfejsFunk2 interfejsFunk2 = (x,y) -> {
            if(x instanceof Integer && y instanceof Integer)
                return "dupaaa";
            else
                return String.valueOf(x) + String.valueOf(y);
        };
        System.out.println(interfejsFunk2.zwrocJakoString(2,3));
        System.out.println(interfejsFunk2.zwrocJakoString("11", "22"));
        /*
        Wy¶wietli:
        233
        dupaaa
        1122
         */
        //////////////////////////////////////////////////////////////////
        InterfejsFunk3<Map<String, Integer>, String, Integer> result3 =
                (string, intidzer) -> {
                    Map<String, Integer> ass = new HashMap<>();
                    ass.put(string, intidzer);
                    return ass;
                };
        System.out.println("xxxxxx -> " +result3.doThisSzit("jeden", 1));
        InterfejsFunk3<Map<String, Integer>, String, Integer> result3a =
                (klucz, wartosc) -> {
                    return new HashMap<String, Integer>() {
                        {put(klucz, wartosc);};
                    };
                };
        System.out.println("zzz -> " +result3a.doThisSzit("dwa", 2));
        /*
        Wy¶wietli:
        xxxxxx -> {jeden=1}
        zzz -> {dwa=2}
         */

        ///////////// Referencje do metod i konstruktorów//////////////////////////////////////////
        InterfejsFunkcyjny<String, Integer> konwerterZreferencja = Integer::valueOf;
        Integer konwertedSzit = konwerterZreferencja.convert("22");
        System.out.println(konwertedSzit);
        /////////
        Somethinh somethinh = new Somethinh();
        InterfejsFunkcyjny<String, String> konwerterCharAt = somethinh::startsWith;
        System.out.println(konwerterCharAt.convert("dupa"));
        /*
        Zwróci:
        22
        d
         */

        //////// a jak to jest z konstruktorem???? /////////////////////////////////////
        PersonFactory<Perosn> newPerson = Perosn::new;
        Perosn perosn = newPerson.create("Jan", "Dupa");
        System.out.println(perosn.firstName+ " " +perosn.lastName);
        /*
        Wy¶wietli:
        Jan Dupa
         */


        ////////////// Zakres wyra¿eñ lambda////////////////////////////////////
        //Dostep do zmiennych lokalnych
        final int num = 1; // ze zwyk³±, czli bez 'final' zmienn± jest podobnie
        InterfejsFunkcyjny<Integer, String> konwerterZeZmiennaLokalna = (in) -> String.valueOf(in + num);
        System.out.println(konwerterZeZmiennaLokalna.convert(3));
        /*
        Wy¶wietli
        4
         */


        ///////////////// Dostêp do pól i zmiennych statycznych. ////////////////
        Lambda4 lambda4 = new Lambda4();
        lambda4.testScopes();
        /*
        To nic nie zwraca, ale pokazuje, ¿e siê nie wywala przy kompilacji.
         */
    }
    static class Somethinh { // musialo byc static wg intellij
        String startsWith(String a) {
            return String.valueOf(a.charAt(0));
        }
    }
}
