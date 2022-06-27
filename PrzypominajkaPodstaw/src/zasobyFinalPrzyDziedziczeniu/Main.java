package zasobyFinalPrzyDziedziczeniu;

public class Main {
    public static void main(String[] args) {
        KlasaZeZmiennymiImetodamiFinal klasaZeZmiennymiImetodamiFinal = new Klasa2();
        System.out.println(klasaZeZmiennymiImetodamiFinal.ass);
        klasaZeZmiennymiImetodamiFinal.metoda();
//        klasaZeZmiennymiImetodamiFinal.metodaaa2(); /// w ten sposob nie mamy dostêpu do tej metody
        System.out.println("\n");
        Klasa2 klasa2 = new Klasa2();
        klasa2.metoda();
        System.out.println();
        klasa2.metodaaa2();
        /*
        Zwróci:
        ass
        zawarto¶æ metody final


        zawarto¶æ metody final

        przed wywolaniem
        zawarto¶æ metody final
         */
    }
}
