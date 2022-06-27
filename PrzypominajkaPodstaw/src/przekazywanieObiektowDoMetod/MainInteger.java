package przekazywanieObiektowDoMetod;

public class MainInteger {
    public static void main(String[] args) {
        KlasaUtilsowa klasaUtilsowa = new KlasaUtilsowa();

        /////////////////////////////////// robienieCzegosZInteger() /////////////////////
        Integer asd = 4;
        System.out.println(asd + " = wartosc1 = du¿y Integer");
        System.out.println(asd.hashCode()+ " - haszkod - klasa g³ówna, sam pocz±tek");
        klasaUtilsowa.robienieCzegosZInteger(asd);
        System.out.println(asd +" - wartosc2 - du¿y Integer ponownie w klasie g³ownej");
        System.out.println(asd.hashCode() + " - haszkod - klasa g³ówna");

        /*
        zwróci:
        4 = wartosc1 = du¿y Integer
        4 - haszkod - klasa g³ówna, sam pocz±tek
        104 - haszkod, ale w KlasaUtilsowa
        104 --- wartosc KlasaUtilsowa - du¿y Integer, ale w KlasaUtilsowa
        4 - wartosc2 - du¿y Integer ponownie w klasie g³ownej
        4 - haszkod - klasa g³ówna
         */

        System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        Integer asd2 = new Integer(5);
        System.out.println(asd2 + " = wartosc1 = du¿y Integer2");
        System.out.println(asd2.hashCode()+ " - haszkod - klasa g³ówna, sam pocz±tek");
        klasaUtilsowa.robienieCzegosZInteger(asd2);
        System.out.println(asd2 +" - wartosc2 - du¿y Integer2 ponownie w klasie g³ownej");
        System.out.println(asd2.hashCode() + " - haszkod - klasa g³ówna");

        /*
        zwróci:
        5 = wartosc1 = du¿y Integer2
        5 - haszkod - klasa g³ówna, sam pocz±tek
        105 - haszkod, ale w KlasaUtilsowa
        105 --- wartosc KlasaUtilsowa - du¿y Integer, ale w KlasaUtilsowa
        5 - wartosc2 - du¿y Integer2 ponownie w klasie g³ownej
        5 - haszkod - klasa g³ówna
         */

        System.out.println("cccccccccccccccccccccccccccccccccccccccccccccccccccc");
        Integer asd3 = Integer.valueOf(5);
        System.out.println(asd2 + " = wartosc1 = du¿y Integer3");
        System.out.println(asd2.hashCode()+ " - haszkod - klasa g³ówna, sam pocz±tek");
        klasaUtilsowa.robienieCzegosZInteger(asd2);
        System.out.println(asd2 +" - wartosc2 - du¿y Integer3 ponownie w klasie g³ownej");
        System.out.println(asd2.hashCode() + " - haszkod - klasa g³ówna");

        /*
        zwróci:
        5 = wartosc1 = du¿y Integer3
        5 - haszkod - klasa g³ówna, sam pocz±tek
        105 - haszkod, ale w KlasaUtilsowa
        105 --- wartosc KlasaUtilsowa - du¿y Integer, ale w KlasaUtilsowa
        5 - wartosc2 - du¿y Integer3 ponownie w klasie g³ownej
        5 - haszkod - klasa g³ówna
         */

        System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        ///////////////////////////////////// robienieCzegosZIntegerFinal() ////////////////////////////
        Integer asd4 = Integer.valueOf(5);
        System.out.println(asd4 + " = wartosc1 = du¿y Integer4");
        System.out.println(asd4.hashCode()+ " - haszkod - klasa g³ówna, sam pocz±tek");
        klasaUtilsowa.robienieCzegosZInteger(asd4);
        System.out.println(asd4 +" - wartosc2 - du¿y Integer4 ponownie w klasie g³ownej");
        System.out.println(asd4.hashCode() + " - haszkod - klasa g³ówna");

        /*
        zwróci:
        5 = wartosc1 = du¿y Integer4
        5 - haszkod - klasa g³ówna, sam pocz±tek
        105 - haszkod, ale w KlasaUtilsowa
        105 --- wartosc KlasaUtilsowa - du¿y Integer, ale w KlasaUtilsowa
        5 - wartosc2 - du¿y Integer4 ponownie w klasie g³ownej
        5 - haszkod - klasa g³ówna
         */


        System.out.println("ssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss");
        ///////////////////////////////////// zwracanieIntegerZmetodyPrzyjmujacejInteger() /////////////////////
        Integer asd6 = Integer.valueOf(5);
        System.out.println(asd6 + " = wartosc1 = du¿y Integer6");
        System.out.println(asd6.hashCode()+ " - haszkod - klasa g³ówna, sam pocz±tek");
        asd6 = klasaUtilsowa.zwracanieIntegerZmetodyPrzyjmujacejInteger(asd4);
        System.out.println(asd6 +" - wartosc2 - du¿y Integer6 ponownie w klasie g³ownej");
        System.out.println(asd6.hashCode() + " - haszkod - klasa g³ówna");

        /*
        zwróci:
        5 = wartosc1 = du¿y Integer6
        5 - haszkod - klasa g³ówna, sam pocz±tek
        5 -- haszkod --- w metodzie1
        27 -- haszkod --- w metodzie2
        27 - wartosc2 - du¿y Integer6 ponownie w klasie g³ownej
        27 - haszkod - klasa g³ówna
         */
    }
}
