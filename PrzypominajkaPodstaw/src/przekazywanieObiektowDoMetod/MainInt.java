package przekazywanieObiektowDoMetod;

public class MainInt {

    public static void main(String[] args) {
        KlasaUtilsowa klasaUtilsowa = new KlasaUtilsowa();
        ///////////////////////////////////////// robienieCzegosZint() /////////////////////////
        int a =2;
        System.out.println(a + " --- robienie czego¶ z int");
        klasaUtilsowa.robienieCzegosZint(a);
        System.out.println(a + " --- po robieniu czego¶ z int");
        /*
        zwróci:
        2 --- robienie czego¶ z int
        12 ===== wynik
        2 --- po robieniu czego¶ z int
         */

        System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        ///////////////////////////////////////////// robienieCzegosZintFinal() ////////////////////
        System.out.println("zzzzzz = " +a);
        klasaUtilsowa.robienieCzegosZintFinal(a);
        System.out.println(a);
        /*
        zwróci:
        zzzzzz = 2
        6 wynik dupa
        2
        */

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        ////////////////////////////////////// robienieCzegosZintOrazZwracanieInt() ///////////////
        System.out.println(a);
        a = klasaUtilsowa.robienieCzegosZintOrazZwracanieInt(a);
        System.out.println(a + " ====== nadpisana warto¶æ, czyli zwrócona");
        /*
        2
        12 ===== wynik
        12 ====== nadpisana warto¶æ, czyli zwrócona
         */

    }

}
