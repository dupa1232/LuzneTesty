package FinalArgumentsToMethod;

public class Main {

    public static void main(String[] args) {

        Klasa klasa = new Klasa();
        final StringBuilder stringBuilder = new StringBuilder("aaaa");
        klasa.metodaPrzyjmujacaStringBuilder(stringBuilder);
        System.out.println(stringBuilder.toString());

        /*
        Tak wywo�ana metoda Main zwr�ci:
        ---------------------------------------
        jeste�my w metodaPrzyjmujacaStringBuilder --- bbb
        aaaa
        ---------------------------------------

        czyli w metodzie z klasy KLasa - powstanie nowy obiekt, gdy zrobimy -> wartosc = new StringBuilder();
         */
        System.out.println(" zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz ");
        final StringBuilder stringBuilder1 = new StringBuilder("xxx");
        klasa.metodaPrzyjmujacaStringBuilderZappednPoDrodze(stringBuilder1);
        System.out.println(stringBuilder1.toString());

        /*
        Tak wywolanie metody Main zwr�ci:
        ----------------------------------------
        xxx -----
        jeste�my w metodaPrzyjmujacaStringBuilderZappednPoDrodze --- yyy -_-_-_-
        xxx -----
        ----------------------------------------

        Czyli jak wida�, tutaj te� tworzone s� dwa niezale�ne obiekty!
         */
    }
}
