package przekazywanieObiektowDoMetod;

public class MainStringBuilder {
    public static void main(String[] args) {
        KlasaUtilsowa klasaUtilsowa = new KlasaUtilsowa();

        /////////////////////////////////////////////////// robienieCzegosZeStringBuilder() //////////////////////////
        StringBuilder sb = new StringBuilder("pocz�tkoweG�wno");
        System.out.println(sb.hashCode() + " --- fyrst ---- " +sb.toString());
        klasaUtilsowa.robienieCzegosZeStringBuilder(sb);
        System.out.println(sb.hashCode() + " --- sekynd ---- " + sb.toString());

        /*
        Zwr�ci:
        488970385 --- fyrst ---- pocz�tkoweG�wno
        488970385 --- jestesmy w metodzie robienieCzegosZeStringBuilder()
        488970385 --- jestesmy w metodzie robienieCzegosZeStringBuilder() znowu
        488970385 --- sekynd ---- pocz�tkoweG�wno -x-x-x-x
         */

        System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        ///////////////////////////////////////////////////// robienieCzegosZeStringBuilderFinal() ////////////////////
        StringBuilder sb2 = new StringBuilder("x");
        System.out.println(sb2.hashCode() + " -------- 1");
        klasaUtilsowa.robienieCzegosZeStringBuilderFinal(sb2);
        System.out.println(sb2.toString() + " --- powr�t do klasy g��nej ");
        System.out.println(sb2.hashCode() + " --- klasa g��wna - haszkod");

        /*
        zwr�ci:
        1945604815 -------- 1
        xdodaj� co� do SB ------
        1945604815  - haszkod xxxx
        xdodaj� co� do SB --- powr�t do klasy g��nej
        1945604815 --- klasa g��wna - haszkod
         */

        System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        ///////////////////////////////////////////////////// robienieCzegosZeStringBuilderIzwracanieSB() ////////////////////
        StringBuilder sb3 = new StringBuilder("x");
        System.out.println(sb3.hashCode() + " -------- 1");
        StringBuilder sb4 = klasaUtilsowa.robienieCzegosZeStringBuilderIzwracanieSB(sb3);
        System.out.println(sb3.toString() + " --- powr�t do klasy g��nej ");
        System.out.println(sb3.hashCode() + " --- klasa g��wna - haszkod");
        System.out.println(sb4.toString() + " --- sb4 w klasie g��wnej ");
        System.out.println(sb4.hashCode() + " --- sb4 hashcode w klasie g��wnej ");

        /*
        zwr�ci:
        403424356 -------- 1
        x ---x-x-x-x-x- -- dodaj� co� do SB --xxxxxxxx----
        403424356  - haszkod yyyyyyyy
        x ---x-x-x-x-x- -- dodaj� co� do SB --- powr�t do klasy g��nej
        403424356 --- klasa g��wna - haszkod
        x ---x-x-x-x-x- -- dodaj� co� do SB --- sb4 w klasie g��wnej
        403424356 --- sb4 hashcode w klasie g��wnej
         */


        ///////////////////////////////////////// robienieCzegosZfinalStringBuilderIzwracanieSB() ///////////////////////
        System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        StringBuilder sb5 = new StringBuilder("x");
        System.out.println(sb5.hashCode() + " -------- 1");
        StringBuilder sb6 = klasaUtilsowa.robienieCzegosZfinalStringBuilderIzwracanieSB(sb5);
        System.out.println(sb5.toString() + " --- powr�t do klasy g��nej xxxxxx ");
        System.out.println(sb5.hashCode() + " --- klasa g��wna - haszkod xxxxxxx");
        System.out.println(sb6.toString() + " --- sb6 w klasie g��wnej xxxxxxxxxxxxx ");
        System.out.println(sb6.hashCode() + " --- sb6 hashcode w klasie g��wnej xxxxxxxxxxx");

        /*
        zwr�ci:
        321142942 -------- 1
        x === dodaj� co� do SB 2222 ------
        321142942  - 1111 haszkod xxxx
        x === dodaj� co� do SB --- powr�t do klasy g��nej xxxxxx
        321142942 --- klasa g��wna - haszkod xxxxxxx
        x === dodaj� co� do SB --- sb6 w klasie g��wnej xxxxxxxxxxxxx
        321142942 --- sb6 hashcode w klasie g��wnej xxxxxxxxxxx
         */

        ///////////////////////////////////////// robienieCzegosZfinalStringBuilderIzwracanieSB() za� ///////////////////////
        System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        final StringBuilder sb8 = new StringBuilder("x");
        System.out.println(sb8.hashCode() + " -------- 2");
        StringBuilder sb9 = klasaUtilsowa.robienieCzegosZfinalStringBuilderIzwracanieSB(sb8);
        System.out.println(sb8.toString() + " --- powr�t do klasy g��nej xxxxxx2 ");
        System.out.println(sb8.hashCode() + " --- klasa g��wna - haszkod xxxxxxx2");
        System.out.println(sb9.toString() + " --- sb9 w klasie g��wnej xxxxxxxxxxxxx2 ");
        System.out.println(sb9.hashCode() + " --- sb9 hashcode w klasie g��wnej xxxxxxxxxxx2");
        /*
        zwr�ci:

        745160567 -------- 2
        x === dodaj� co� do SB 2222 ------
        745160567  - 1111 haszkod xxxx
        x === dodaj� co� do SB --- powr�t do klasy g��nej xxxxxx2
        745160567 --- klasa g��wna - haszkod xxxxxxx2
        x === dodaj� co� do SB --- sb9 w klasie g��wnej xxxxxxxxxxxxx2
        745160567 --- sb9 hashcode w klasie g��wnej xxxxxxxxxxx2
         */


        ///////////////////////////////////////// robienieCzegosZfinalStringBuilderIzwracanieSB() za� ///////////////////////
        System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        final StringBuilder sbX = new StringBuilder("x  -");
        System.out.println(sbX.hashCode() + " -------- 6");
        StringBuilder sbY = klasaUtilsowa.robienieCzegosZeStringBuilderIzwracanieSB22222(sb8);
        System.out.println(sbX.toString() + " --- powr�t do klasy g��nej xxxxxx6 ");
        System.out.println(sbX.hashCode() + " --- klasa g��wna - haszkod xxxxxxx6");
        System.out.println(sbY.toString() + " --- sb9 w klasie g��wnej xxxxxxxxxxxxx6 ");
        System.out.println(sbY.hashCode() + " --- sb9 hashcode w klasie g��wnej xxxxxxxxxxx6");

        /*
        zwr�ci:
        610984013 -------- 6
        x === dodaj� co� do SB --ccccc -- dodaj� co� do SB --cccccc----
        745160567  - haszkod ddddddd
        x  - --- powr�t do klasy g��nej xxxxxx6
        610984013 --- klasa g��wna - haszkod xxxxxxx6
        nowy SB! --- sb9 w klasie g��wnej xxxxxxxxxxxxx6
        1644443712 --- sb9 hashcode w klasie g��wnej xxxxxxxxxxx6
         */
    }
}
