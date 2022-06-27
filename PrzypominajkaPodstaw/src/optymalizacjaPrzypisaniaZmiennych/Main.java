package optymalizacjaPrzypisaniaZmiennych;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer a1 = 1;
        Integer a2 = new Integer(1);
        Integer a3 = a1;
        Integer a4 = a2;
        Integer a5 = new Integer(a3);
        Integer a6 = 1;
        Integer a7 = new Integer(1);
        Integer a8 = a1;
        Integer a9 = a2;
        Integer a10 = new Integer(a8);
        Integer a11 = new Integer(1);
        Integer a12 = 1;
        System.out.println("a1 hashcode: " +a1.hashCode());
        System.out.println("a2 hashcode: " +a2.hashCode());
        System.out.println("a3 hashcode: " +a3.hashCode());
        System.out.println("a4 hashcode: " +a4.hashCode());
        System.out.println("a5 hashcode: " +a5.hashCode());
        System.out.println("a6 hashcode: " +a6.hashCode());
        System.out.println("a7 hashcode: " +a7.hashCode());
        System.out.println("a8 hashcode: " +a8.hashCode());
        System.out.println("a9 hashcode: " +a9.hashCode());
        System.out.println("a10 hashcode: " +a10.hashCode());
        System.out.println();
        System.out.println(a1 == a2);
        System.out.println(a2 == a11);
        System.out.println(a1 == a12);
        System.out.println(a10 == a8);

        /*
        a1 hashcode: 1
        a2 hashcode: 1
        a3 hashcode: 1
        a4 hashcode: 1
        a5 hashcode: 1
        a6 hashcode: 1
        a7 hashcode: 1
        a8 hashcode: 1
        a9 hashcode: 1
        a10 hashcode: 1

        false
        false
        true
        false
         */

        System.out.println("\n\n\n");

        String s1 = "asd";
        String s2 = new String("asd");
        String s3 = s1;
        String s4 = s2;
        String s5 = new String(s3);
        String s6 = "asd";
        String s7 = new String("asd");
        String s8 = s1;
        String s9 = s2;
        String s10 = new String(s8);
        String s11 = new String(s2);
        System.out.println("s1 hashcode: " +s1.hashCode());
        System.out.println("s2 hashcode: " +s2.hashCode());
        System.out.println("s3 hashcode: " +s3.hashCode());
        System.out.println("s4 hashcode: " +s4.hashCode());
        System.out.println("s5 hashcode: " +s5.hashCode());
        System.out.println("s6 hashcode: " +s6.hashCode());
        System.out.println("s7 hashcode: " +s7.hashCode());
        System.out.println("s8 hashcode: " +s8.hashCode());
        System.out.println("s9 hashcode: " +s9.hashCode());
        System.out.println("s10 hashcode: " +s10.hashCode());
        System.out.println();
        System.out.println(s1 == s2);
        System.out.println(s3 == s1);
        System.out.println(s2 == s5);
        System.out.println(s1 == s6);
        System.out.println(s2 == s7);
        System.out.println(s10 == s8);
        System.out.println(s11 == s2);
        /*
        s1 hashcode: 96882
        s2 hashcode: 96882
        s3 hashcode: 96882
        s4 hashcode: 96882
        s5 hashcode: 96882
        s6 hashcode: 96882
        s7 hashcode: 96882
        s8 hashcode: 96882
        s9 hashcode: 96882
        s10 hashcode: 96882

        false
        true
        false
        true
        false
        false
        false

         */
        System.out.println("\n\n\n");


        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = Arrays.asList(1, 2, 3);
//        l2.add(4); /// tak te¿ nie mo¿na zrobiæ, bo leci UnsupportedOperationException!!!!!!!
        List<Integer> l3 = List.of(1, 2, 3); /// ta lista jest immutable, czyli nie mozna do niej dodawaæ!!!
//        l3.add(4); /// oficjalnie nie podkre¶la, ale podczas odpalenia kodu leci ImmutableCollections b³±d
        List<Integer> l4 = new ArrayList() {{
            add(1);
            add(2);
            add(3);
        }};
        List<Integer> l5 = new ArrayList<>();
        List<Integer> l6 = Arrays.asList(1, 2, 3);
        List<Integer> l7 = List.of(1, 2, 3); /// ta lista jest immutable, czyli nie mozna do niej dodawaæ!!!
//        l3.add(4); /// oficjalnie nie podkre¶la, ale podczas odpalenia kodu leci ImmutableCollections b³±d
        List<Integer> l8 = new ArrayList() {{
            add(1);
            add(2);
            add(3);
        }};
        List<Integer> l9 = l8;
        List<Integer> l10 = l2;
        List<Integer> l11 = l3;
        List<Integer> l12 = l4;
        List<Integer> l13 = new ArrayList<>(l5);

        System.out.println("l1 hashcode: " +l1.hashCode());
        System.out.println("l2 hashcode: " +l2.hashCode());
        System.out.println("l3 hashcode: " +l3.hashCode());
        System.out.println("l4 hashcode: " +l4.hashCode());
        System.out.println("l5 hashcode: " +l5.hashCode());
        System.out.println("l6 hashcode: " +l6.hashCode());
        System.out.println("l7 hashcode: " +l7.hashCode());
        System.out.println("l8 hashcode: " +l8.hashCode());
        System.out.println();
        System.out.println(l1 == l5);
        System.out.println(l2 == l3);
        System.out.println(l2 == l6);
        System.out.println(l4 == l8);
        System.out.println(l3 == l7);
        System.out.println(l3 == l4);
        System.out.println(l4 == l2);
        System.out.println(l9 == l8);
        System.out.println(l10 == l2);
        System.out.println(l11 == l3);
        System.out.println(l12 == l4);
        System.out.println(l13 == l5);
        /*
        l1 hashcode: 1
        l2 hashcode: 30817
        l3 hashcode: 30817
        l4 hashcode: 30817
        l5 hashcode: 1
        l6 hashcode: 30817
        l7 hashcode: 30817
        l8 hashcode: 30817

        false
        false
        false
        false
        false
        false
        false
        true
        true
        true
        true
        false
         */

    }
}
