package przekazywanieObiektowDoMetod;

public class MainDouble {

    public static void main(String[] args) {
        KlasaUtilsowa klasaUtilsowa = new KlasaUtilsowa();

        /////////////////////////////////// robienieCzegosZDouble() /////////////////////
        Double asd = 4.0;
        System.out.println(asd + " = wartosc1 = du¿y Double");
        System.out.println(asd.hashCode()+ " - haszkod - klasa g³ówna, sam pocz±tek");
        klasaUtilsowa.robienieCzegosZDouble(asd);
        System.out.println(asd +" - wartosc2 - du¿y Double ponownie w klasie g³ownej");
        System.out.println(asd.hashCode() + " - haszkod - klasa g³ówna");

        /*
        zwróci:
        4.0 = wartosc1 = du¿y Double
        1074790400 - haszkod - klasa g³ówna, sam pocz±tek
        1079640064 - haszkod, ale w KlasaUtilsowa
        104.0 --- wartosc KlasaUtilsowa - du¿y Double, ale w KlasaUtilsowa
        4.0 - wartosc2 - du¿y Double ponownie w klasie g³ownej
        1074790400 - haszkod - klasa g³ówna
         */

        System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        Double asd2 = new Double(5);
        System.out.println(asd2 + " = wartosc1 = du¿y Double2");
        System.out.println(asd2.hashCode()+ " - haszkod - klasa g³ówna, sam pocz±tek");
        klasaUtilsowa.robienieCzegosZDouble(asd2);
        System.out.println(asd2 +" - wartosc2 - du¿y Double2 ponownie w klasie g³ownej");
        System.out.println(asd2.hashCode() + " - haszkod - klasa g³ówna");

        /*
        zwróci:
        5.0 = wartosc1 = du¿y Double2
        1075052544 - haszkod - klasa g³ówna, sam pocz±tek
        1079656448 - haszkod, ale w KlasaUtilsowa
        105.0 --- wartosc KlasaUtilsowa - du¿y Double, ale w KlasaUtilsowa
        5.0 - wartosc2 - du¿y Double2 ponownie w klasie g³ownej
        1075052544 - haszkod - klasa g³ówna
         */

        System.out.println("cccccccccccccccccccccccccccccccccccccccccccccccccccc");
        Double asd3 = Double.valueOf(5);
        System.out.println(asd2 + " = wartosc1 = du¿y Double3");
        System.out.println(asd2.hashCode()+ " - haszkod - klasa g³ówna, sam pocz±tek");
        klasaUtilsowa.robienieCzegosZDouble(asd2);
        System.out.println(asd2 +" - wartosc2 - du¿y Double3 ponownie w klasie g³ownej");
        System.out.println(asd2.hashCode() + " - haszkod - klasa g³ówna");

        /*
        zwróci:
        5.0 = wartosc1 = du¿y Double3
        1075052544 - haszkod - klasa g³ówna, sam pocz±tek
        1079656448 - haszkod, ale w KlasaUtilsowa
        105.0 --- wartosc KlasaUtilsowa - du¿y Double, ale w KlasaUtilsowa
        5.0 - wartosc2 - du¿y Double3 ponownie w klasie g³ownej
        1075052544 - haszkod - klasa g³ówna
         */

        System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        ///////////////////////////////////// robienieCzegosZDoubleFinal() ////////////////////////////
        Double asd4 = Double.valueOf(5);
        System.out.println(asd4 + " = wartosc1 = du¿y Double4");
        System.out.println(asd4.hashCode()+ " - haszkod - klasa g³ówna, sam pocz±tek");
        klasaUtilsowa.robienieCzegosZDouble(asd4);
        System.out.println(asd4 +" - wartosc2 - du¿y Double4 ponownie w klasie g³ownej");
        System.out.println(asd4.hashCode() + " - haszkod - klasa g³ówna");

        /*
        zwróci:
        5.0 = wartosc1 = du¿y Double4
        1075052544 - haszkod - klasa g³ówna, sam pocz±tek
        1079656448 - haszkod, ale w KlasaUtilsowa
        105.0 --- wartosc KlasaUtilsowa - du¿y Double, ale w KlasaUtilsowa
        5.0 - wartosc2 - du¿y Double4 ponownie w klasie g³ownej
        1075052544 - haszkod - klasa g³ówna
         */


        System.out.println("ssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss");
        ///////////////////////////////////// zwracanieDoubleZmetodyPrzyjmujacejDouble() /////////////////////
        Double asd6 = Double.valueOf(5);
        System.out.println(asd6 + " = wartosc1 = du¿y Double6");
        System.out.println(asd6.hashCode()+ " - haszkod - klasa g³ówna, sam pocz±tek");
        asd6 = klasaUtilsowa.zwracanieDoubleZmetodyPrzyjmujacejDouble(asd4);
        System.out.println(asd6 +" - wartosc2 - du¿y Double6 ponownie w klasie g³ownej");
        System.out.println(asd6.hashCode() + " - haszkod - klasa g³ówna");

        /*
        zwróci:
        5.0 = wartosc1 = du¿y Double6
        1075052544 - haszkod - klasa g³ówna, sam pocz±tek
        1075052544 -- haszkod --- w metodzie1
        1077608448 -- haszkod --- w metodzie2
        27.0 - wartosc2 - du¿y Double6 ponownie w klasie g³ownej
        1077608448 - haszkod - klasa g³ówna
         */
    }
}
