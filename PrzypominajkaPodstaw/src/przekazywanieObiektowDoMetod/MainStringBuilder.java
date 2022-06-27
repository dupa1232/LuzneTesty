package przekazywanieObiektowDoMetod;

public class MainStringBuilder {
    public static void main(String[] args) {
        KlasaUtilsowa klasaUtilsowa = new KlasaUtilsowa();

        /////////////////////////////////////////////////// robienieCzegosZeStringBuilder() //////////////////////////
        StringBuilder sb = new StringBuilder("pocz±tkoweGówno");
        System.out.println(sb.hashCode() + " --- fyrst ---- " +sb.toString());
        klasaUtilsowa.robienieCzegosZeStringBuilder(sb);
        System.out.println(sb.hashCode() + " --- sekynd ---- " + sb.toString());

        /*
        Zwróci:
        488970385 --- fyrst ---- pocz±tkoweGówno
        488970385 --- jestesmy w metodzie robienieCzegosZeStringBuilder()
        488970385 --- jestesmy w metodzie robienieCzegosZeStringBuilder() znowu
        488970385 --- sekynd ---- pocz±tkoweGówno -x-x-x-x
         */

        System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        ///////////////////////////////////////////////////// robienieCzegosZeStringBuilderFinal() ////////////////////
        StringBuilder sb2 = new StringBuilder("x");
        System.out.println(sb2.hashCode() + " -------- 1");
        klasaUtilsowa.robienieCzegosZeStringBuilderFinal(sb2);
        System.out.println(sb2.toString() + " --- powrót do klasy g³ónej ");
        System.out.println(sb2.hashCode() + " --- klasa g³ówna - haszkod");

        /*
        zwróci:
        1945604815 -------- 1
        xdodajê co¶ do SB ------
        1945604815  - haszkod xxxx
        xdodajê co¶ do SB --- powrót do klasy g³ónej
        1945604815 --- klasa g³ówna - haszkod
         */

        System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        ///////////////////////////////////////////////////// robienieCzegosZeStringBuilderIzwracanieSB() ////////////////////
        StringBuilder sb3 = new StringBuilder("x");
        System.out.println(sb3.hashCode() + " -------- 1");
        StringBuilder sb4 = klasaUtilsowa.robienieCzegosZeStringBuilderIzwracanieSB(sb3);
        System.out.println(sb3.toString() + " --- powrót do klasy g³ónej ");
        System.out.println(sb3.hashCode() + " --- klasa g³ówna - haszkod");
        System.out.println(sb4.toString() + " --- sb4 w klasie g³ównej ");
        System.out.println(sb4.hashCode() + " --- sb4 hashcode w klasie g³ównej ");

        /*
        zwróci:
        403424356 -------- 1
        x ---x-x-x-x-x- -- dodajê co¶ do SB --xxxxxxxx----
        403424356  - haszkod yyyyyyyy
        x ---x-x-x-x-x- -- dodajê co¶ do SB --- powrót do klasy g³ónej
        403424356 --- klasa g³ówna - haszkod
        x ---x-x-x-x-x- -- dodajê co¶ do SB --- sb4 w klasie g³ównej
        403424356 --- sb4 hashcode w klasie g³ównej
         */


        ///////////////////////////////////////// robienieCzegosZfinalStringBuilderIzwracanieSB() ///////////////////////
        System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        StringBuilder sb5 = new StringBuilder("x");
        System.out.println(sb5.hashCode() + " -------- 1");
        StringBuilder sb6 = klasaUtilsowa.robienieCzegosZfinalStringBuilderIzwracanieSB(sb5);
        System.out.println(sb5.toString() + " --- powrót do klasy g³ónej xxxxxx ");
        System.out.println(sb5.hashCode() + " --- klasa g³ówna - haszkod xxxxxxx");
        System.out.println(sb6.toString() + " --- sb6 w klasie g³ównej xxxxxxxxxxxxx ");
        System.out.println(sb6.hashCode() + " --- sb6 hashcode w klasie g³ównej xxxxxxxxxxx");

        /*
        zwróci:
        321142942 -------- 1
        x === dodajê co¶ do SB 2222 ------
        321142942  - 1111 haszkod xxxx
        x === dodajê co¶ do SB --- powrót do klasy g³ónej xxxxxx
        321142942 --- klasa g³ówna - haszkod xxxxxxx
        x === dodajê co¶ do SB --- sb6 w klasie g³ównej xxxxxxxxxxxxx
        321142942 --- sb6 hashcode w klasie g³ównej xxxxxxxxxxx
         */

        ///////////////////////////////////////// robienieCzegosZfinalStringBuilderIzwracanieSB() za¶ ///////////////////////
        System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        final StringBuilder sb8 = new StringBuilder("x");
        System.out.println(sb8.hashCode() + " -------- 2");
        StringBuilder sb9 = klasaUtilsowa.robienieCzegosZfinalStringBuilderIzwracanieSB(sb8);
        System.out.println(sb8.toString() + " --- powrót do klasy g³ónej xxxxxx2 ");
        System.out.println(sb8.hashCode() + " --- klasa g³ówna - haszkod xxxxxxx2");
        System.out.println(sb9.toString() + " --- sb9 w klasie g³ównej xxxxxxxxxxxxx2 ");
        System.out.println(sb9.hashCode() + " --- sb9 hashcode w klasie g³ównej xxxxxxxxxxx2");
        /*
        zwróci:

        745160567 -------- 2
        x === dodajê co¶ do SB 2222 ------
        745160567  - 1111 haszkod xxxx
        x === dodajê co¶ do SB --- powrót do klasy g³ónej xxxxxx2
        745160567 --- klasa g³ówna - haszkod xxxxxxx2
        x === dodajê co¶ do SB --- sb9 w klasie g³ównej xxxxxxxxxxxxx2
        745160567 --- sb9 hashcode w klasie g³ównej xxxxxxxxxxx2
         */


        ///////////////////////////////////////// robienieCzegosZfinalStringBuilderIzwracanieSB() za¶ ///////////////////////
        System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        final StringBuilder sbX = new StringBuilder("x  -");
        System.out.println(sbX.hashCode() + " -------- 6");
        StringBuilder sbY = klasaUtilsowa.robienieCzegosZeStringBuilderIzwracanieSB22222(sb8);
        System.out.println(sbX.toString() + " --- powrót do klasy g³ónej xxxxxx6 ");
        System.out.println(sbX.hashCode() + " --- klasa g³ówna - haszkod xxxxxxx6");
        System.out.println(sbY.toString() + " --- sb9 w klasie g³ównej xxxxxxxxxxxxx6 ");
        System.out.println(sbY.hashCode() + " --- sb9 hashcode w klasie g³ównej xxxxxxxxxxx6");

        /*
        zwróci:
        610984013 -------- 6
        x === dodajê co¶ do SB --ccccc -- dodajê co¶ do SB --cccccc----
        745160567  - haszkod ddddddd
        x  - --- powrót do klasy g³ónej xxxxxx6
        610984013 --- klasa g³ówna - haszkod xxxxxxx6
        nowy SB! --- sb9 w klasie g³ównej xxxxxxxxxxxxx6
        1644443712 --- sb9 hashcode w klasie g³ównej xxxxxxxxxxx6
         */
    }
}
