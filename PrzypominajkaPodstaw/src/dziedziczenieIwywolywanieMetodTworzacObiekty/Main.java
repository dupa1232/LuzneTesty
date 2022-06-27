package dziedziczenieIwywolywanieMetodTworzacObiekty;

public class Main {
    public static void main(String[] args) {
        Klasa1 klasa1 = new Klasa1();
        klasa1.metodaWklasie1();
        klasa1.metodaWklasie1DoNadpisania();

        System.out.println();
        Klasa1 klasa1aleNewKlasa2 = new Klasa2();
        klasa1aleNewKlasa2.metodaWklasie1();
//        klasa1aleNewKlasa2.metodaWklasie2(); /// nie ma dostepu do tej metody
        klasa1aleNewKlasa2.metodaWklasie1DoNadpisania();

        System.out.println();
        Klasa2 klasa2 = new Klasa2();
        klasa2.metodaWklasie1();
        klasa2.metodaWklasie2();
        klasa2.metodaWklasie1DoNadpisania();

        /////// jak widaæ, dziedziczenia sprawia, ¿e jak do metody deklarujemy 'rodzica', to mozemy 'dzieci' potem przekazywac
        Klasa3 klasa3 = new Klasa3();
        klasa3.metodaPrzyjmujacaObiektKlasy1(klasa1);
        klasa3.metodaPrzyjmujacaObiektKlasy1(klasa1aleNewKlasa2);
        klasa3.metodaPrzyjmujacaObiektKlasy1(klasa2);
        /////// jak widaæ, dziedziczenia sprawia, ¿e jak do metody deklarujemy 'rodzica', to mozemy 'dzieci' potem przekazywac


        /*
        Zwróci:
        metodaWklasie1()
        metodaWklasie1DoNadpisania() = ale przed nadpisaniem

        metodaWklasie1()
        metodaWklasie1DoNadpisania() = ale przed nadpisaniem
        zawartosc po nadpisaniu!

        metodaWklasie1()
        metoda w klasie 2!
        metodaWklasie1DoNadpisania() = ale przed nadpisaniem
        zawartosc po nadpisaniu!
         */
    }
}
