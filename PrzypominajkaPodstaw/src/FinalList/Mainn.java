package FinalList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
Do final List<> mo¿emy dodawaæ i usuwaæ warto¶ci, ale nie mo¿emy zrobiæ:
final List<Integer> aaa = new ArrayList<>();
aaa = new ArrayList<>(); /// górne mo¿emy zrobiæ, a tej linijki nie!
 */

public class Mainn {
    public static void main(String[] args) {
        final List<Integer> finalList = new ArrayList<>();
        finalList.add(2);
        finalList.add(5);
        System.out.println(finalList);
        finalList.remove(0);
        System.out.println(finalList);

//        finalList = new ArrayList<>(); /// nie mo¿na przypisaæ warto¶ci jeszcze raz do zmiennej final!

        /////////////////////////////////////////////////////////////////////////// inny sposób deklarowania listy ---
        // nie dzia³a podobnie jak unmodifableList, ale efekt podobny :)
        List<Integer> ppp = Arrays.asList(1,2,3);
        System.out.println(ppp);
//        ppp.add(5); /// UnsupportedOperationException - nie mo¿na dodaæ do AbstractList
        ///////////////////////////////////////////// bo chc±c zrobic unmodifableList, trzeba tak:
        ppp = Collections.unmodifiableList(ppp);

        ///////////////////////////////////////////////////////////////////////// inny sposób deklarowania listy ---
        // w ten sposób dzia³a podobnie jak unmodifableList i od Javy 9 zalecaj± tak robiæ, gdy chcemy unmodifable
        List<Integer> aaa = List.of(1,2,4,5);
        System.out.println(aaa);
//        aaa.add(22); /// UnsupportedOperationException - nie mo¿na dodaæ do ImmutableCollections

        ///////////////////////////////////////////////////////////////////////// unmodifableList
        List<Integer> ddd = new ArrayList<>();
        ddd.add(2);
        ddd = Collections.unmodifiableList(ddd);
//        ddd.add(444); //// UnsupportedOperationException - nie mo¿na dodaæ do ImmutableCollections

        ///////////////////////////////////////////////////////////////////////// jak szybko zrobiæ listê modyfikowaln±?
        List<Integer> asddd = new ArrayList<>(Arrays.asList(1,3,4,56));
        asddd.add(666);
        System.out.println(asddd);
        List<Integer> asddd2 = new ArrayList<>(List.of(33,44,55));
        asddd2.add(123);
        System.out.println(asddd2);
    }
}
