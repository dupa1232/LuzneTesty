package zasobyFinalPrzyDziedziczeniu;

public class Klasa2 extends KlasaZeZmiennymiImetodamiFinal {

    public void metodaaa2() {
//        String ass = ass; /// dost�p jest, ale narzeka, �e "variable might not have been initialized"
        System.out.println("przed wywolaniem");
        metoda(); /// jak wida�, dost�p do tej metody jest, ale ....
    }
//    .... nie mozemy jej nadpisa�, bo jest final
//    @Override
//    public void metoda () {}
}
