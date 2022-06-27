package zasobyFinalPrzyDziedziczeniu;

public class Klasa2 extends KlasaZeZmiennymiImetodamiFinal {

    public void metodaaa2() {
//        String ass = ass; /// dostêp jest, ale narzeka, ¿e "variable might not have been initialized"
        System.out.println("przed wywolaniem");
        metoda(); /// jak widaæ, dostêp do tej metody jest, ale ....
    }
//    .... nie mozemy jej nadpisaæ, bo jest final
//    @Override
//    public void metoda () {}
}
