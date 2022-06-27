package FinalList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
Do final List<> mo�emy dodawa� i usuwa� warto�ci, ale nie mo�emy zrobi�:
final List<Integer> aaa = new ArrayList<>();
aaa = new ArrayList<>(); /// g�rne mo�emy zrobi�, a tej linijki nie!
 */

public class Mainn {
    public static void main(String[] args) {
        final List<Integer> finalList = new ArrayList<>();
        finalList.add(2);
        finalList.add(5);
        System.out.println(finalList);
        finalList.remove(0);
        System.out.println(finalList);

//        finalList = new ArrayList<>(); /// nie mo�na przypisa� warto�ci jeszcze raz do zmiennej final!

        /////////////////////////////////////////////////////////////////////////// inny spos�b deklarowania listy ---
        // nie dzia�a podobnie jak unmodifableList, ale efekt podobny :)
        List<Integer> ppp = Arrays.asList(1,2,3);
        System.out.println(ppp);
//        ppp.add(5); /// UnsupportedOperationException - nie mo�na doda� do AbstractList
        ///////////////////////////////////////////// bo chc�c zrobic unmodifableList, trzeba tak:
        ppp = Collections.unmodifiableList(ppp);

        ///////////////////////////////////////////////////////////////////////// inny spos�b deklarowania listy ---
        // w ten spos�b dzia�a podobnie jak unmodifableList i od Javy 9 zalecaj� tak robi�, gdy chcemy unmodifable
        List<Integer> aaa = List.of(1,2,4,5);
        System.out.println(aaa);
//        aaa.add(22); /// UnsupportedOperationException - nie mo�na doda� do ImmutableCollections

        ///////////////////////////////////////////////////////////////////////// unmodifableList
        List<Integer> ddd = new ArrayList<>();
        ddd.add(2);
        ddd = Collections.unmodifiableList(ddd);
//        ddd.add(444); //// UnsupportedOperationException - nie mo�na doda� do ImmutableCollections

        ///////////////////////////////////////////////////////////////////////// jak szybko zrobi� list� modyfikowaln�?
        List<Integer> asddd = new ArrayList<>(Arrays.asList(1,3,4,56));
        asddd.add(666);
        System.out.println(asddd);
        List<Integer> asddd2 = new ArrayList<>(List.of(33,44,55));
        asddd2.add(123);
        System.out.println(asddd2);
    }
}
