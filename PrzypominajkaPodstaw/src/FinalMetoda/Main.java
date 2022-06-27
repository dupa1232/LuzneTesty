package FinalMetoda;

/// Methods marked as final cannot be overridden. Ale mo¿na oczywi¶cie na obiekcie klasy nadrzednej, czyli tej, z któej siê dziedziczy, wywolac metode od klasy,
// "podrzednej", czyli tej, ktora dziedziczy. O ile modyfikatory  dostêpu s± odpowiednie - ~czyli dziecko moze korzystac z cech rodzica
/// https://www.baeldung.com/java-final
public class Main {
    public static void main(String[] args) {
        KlasaZmetodaFinal klasaZmetodaFinal = new KlasaZmetodaFinal();
        System.out.println("1.");
        klasaZmetodaFinal.metodaFinal();
        System.out.println("2.");
        klasaZmetodaFinal.metodaNieFinal();

        Klasa2 klasa2 = new Klasa2();
        System.out.println("3.");
        klasa2.metodaFinal();
        System.out.println("4.");
        klasa2.metodaNieFinal();

        KlasaZmetodaFinal klasaZmetodaFinal1 = new Klasa2();
        System.out.println("5.");
        klasaZmetodaFinal1.metodaNieFinal();
        System.out.println("6.");
        klasaZmetodaFinal1.metodaFinal();

//        Klasa2 klasa21 = new KlasaZmetodaFinal(); //// tak nie mozna !!!!!!!!

        ////// Tak wy¶wietli:
        /*
        1.
        metodaFinal
        2.
        metodaNieFinal
        3.
        metodaFinal
        4.
        metodaNieFinal
        metodaNieFInal, ale z nadpisanej klasy, czyli z Klasa2
        5.
        metodaNieFinal
        metodaNieFInal, ale z nadpisanej klasy, czyli z Klasa2
        6.
        metodaFinal
         */
    }
}
