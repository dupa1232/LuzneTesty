package przekazywanieObiektowDoMetod;

import java.util.ArrayList;
import java.util.List;

public class MainList {

    public static void main(String[] args) {
        KlasaUtilsowa klasaUtilsowa = new KlasaUtilsowa();

        //// lista
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        System.out.println(lista.hashCode() + " --- hashCode() - metoda g³ówna - Lista");
        klasaUtilsowa.robienieCzegosZlist(lista);
        lista.stream().forEach(x -> System.out.print(x + ", ")); //// wydrukuje =>>> 1, 2, 3, 666,
        lista.add(123);
        System.out.println();
        lista.stream().forEach(x -> System.out.print(x + ", ")); //// wydrukuje ->>> 1, 2, 3, 666, 123,

        /*
        zwróci:
        30817 --- hashCode() - metoda g³ówna - Lista
        30817   --- hashCode() robienieCzegosZlist() - KlasaUtilsowa
        1, 2, 3, 666,
        1, 2, 3, 666, 123,
         */

        /**
         * Podsumowuj±c:
         * Przekazywanie obiektu dzia³a tak, ¿e w³a¶nie przekazywany on jest (albo referencja do niego), dziêki czemu, wydruk warto¶ci po dodawaniu w sposób jak wy¿ej
         * zachowuje siê jak widaæ wy¿ej. Dodatkowo - hashCode() jest taki sam (patrz miejsce wywo³ania i KlasaUtilsowa), czyli jak widaæ - mowa jest o tym samym obiekcie.
         */

        System.out.println();
        System.out.println("//////////////////////////////////////////////////////////////////////");
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("------------------------- metoda metodaZwracajacaListe() --------------------------------");
        List<Integer> mzl = klasaUtilsowa.metodaZwracajacaListe();
        System.out.println(mzl.hashCode() + " --- metodaZwracajacaListe(), ju¿ z Main()");

        /*
        zwróci:
        1 --- hashCode() w metodaZwracajacaListe() z KlasaUtilsowa.
        1248 --- metodaZwracajacaListe(), ju¿ z Main()
         */
        /*
            Jak siê mo¿na by³o spodziewaæ - maj± ró¿ne hashCode() !!!!!!!!!!!!!!!
         */

        System.out.println("/////////////////////////////////////////////////////////////////////////");
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("------------------------- metoda metodaZwracajacaListe() wariant 2 --------------------------------");
        List<Integer> mzl2 = new ArrayList<>();
        mzl2.add(999);
        System.out.println(mzl2.hashCode() + " --- hashCode() z pocz±tku");
        mzl2 = klasaUtilsowa.metodaZwracajacaListe();
        System.out.println(mzl2.hashCode() + " --- hashCode() z koñca");
        mzl2.stream().forEach(x -> System.out.print(x + "; "));
        /*
        !!!! Ka¿dy hashCode() w tym przypadku jest ró¿ny, czyli
        1030 --- hashCode() z pocz±tku
        1 --- metodaZwracajacaListe() z KlasaUtilsowa.
        1248 --- hashCode() z koñca
        Wszystkie s± ró¿ne!!!

        Wydruk strumieniem wydrukwoa³ oczywi¶cie warto¶ci: 9; 8; --- czyli te, które zwraca metoda metodaZwracajacaListe()
         */

        System.out.println("------------------------- metoda robienieCzegosZmapaPrzyjmujacaFinalList() --------------------------------");
        List<Integer> listaDlaMetodyZfinalList = new ArrayList<>();
        listaDlaMetodyZfinalList.add(3);
        System.out.println(listaDlaMetodyZfinalList.hashCode() + " --- robienieCzegosZmapaPrzyjmujacaFinalList() hashCode z Main");
        klasaUtilsowa.robienieCzegosZmapaPrzyjmujacaFinalList(listaDlaMetodyZfinalList);
        listaDlaMetodyZfinalList.stream().forEach(x -> System.out.print(x + ", "));

        /*
        Efekt dzia³ania:
        34 --- robienieCzegosZmapaPrzyjmujacaFinalList() hashCode z Main
        34 ---- robienieCzegosZmapaPrzyjmujacaFinalList() - hashCode - KlasaUtilsowa
        lista po dodaniu 11111111 ---- 3 ; 111111 ;
        3, 111111,

        Czyli, hashCode() maj± taki sam. Warto¶ci po dodaniu w metodzie klasy KlasaUtilsowa oraz "zwroceniu", s± takie same - czyli zawiera to, co zosta³o
        dodane w Main oraz w KlasaUtilsowa.
         */

        //////////////////////////////////////////////////////////////////////////////////////////////////////////// Co to znaczy final przed List?
        /*
        final przed List nie sprawia, ¿e nie mo¿emy dodawaæ, usuwaæ warto¶ci z takiej listy. W tym przypadku final powoduje, ¿e nie mo¿emy zmieniæ referencji, czyli
        do listy zainicjalizowanej przez final, nie mo¿emy potem jeszcze raz przypisaæ:
        dupa = new ArrayList<>();!
         */
        System.out.println();
        System.out.println("~~~~~~~~~~~~~~ final list ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        final List<String> dupa = new ArrayList<>();
        dupa.add("dupa1");
        dupa.add("dupa2");
        dupa.stream().forEach(x -> System.out.print(x+ " + "));
        System.out.println();
        dupa.remove(1);
        dupa.stream().forEach(x -> System.out.print(x+ " - "));
//        dupa = new ArrayList<>(); /// tak nie mo¿emy zrobiæ, bo lista wy¿ej zadeklarowana jest jako final!!!!!!!!


        System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("------------------------- metoda robienieCzegosZmapaPrzyjmujacaFinalListMetodaKtoraZwracaList() --------------------------------");
        List<Integer> robienieCzegosZmapaPrzyjmujacaFinalListMetodaKtoraZwracaList = new ArrayList<>();
        robienieCzegosZmapaPrzyjmujacaFinalListMetodaKtoraZwracaList.add(3);
        System.out.println(robienieCzegosZmapaPrzyjmujacaFinalListMetodaKtoraZwracaList.hashCode() + " --- robienieCzegosZmapaPrzyjmujacaFinalListMetodaKtoraZwracaList() hashCode z Main");
        robienieCzegosZmapaPrzyjmujacaFinalListMetodaKtoraZwracaList = klasaUtilsowa.robienieCzegosZmapaPrzyjmujacaFinalListMetodaKtoraZwracaList(listaDlaMetodyZfinalList);
        listaDlaMetodyZfinalList.stream().forEach(x -> System.out.print(x + ", "));
        System.out.println();
        System.out.println(robienieCzegosZmapaPrzyjmujacaFinalListMetodaKtoraZwracaList.hashCode()+ "; ---- hashCode()");

    }
}

