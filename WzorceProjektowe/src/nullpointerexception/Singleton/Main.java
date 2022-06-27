package nullpointerexception.Singleton;

public class Main {
    /*
    Kolejny bardzo popularny wzorzec to singleton. S�u�y on do zapewnienia, �e dany obiekt zostanie stworzony tylko raz. Ma to na celu
    ograniczenie ilo�ci obiekt�w tworzonych w aplikacji. Cz�sto Singleton okre�lany jest anty wzorcem poniewa� �amie on zasady programowania
    obiektowego (wprowadza globalny stan). A tak�e mo�e znacz�co utrudni� testowanie.

    Mimo, �e singleton mo�e sprawia� nam pewne problemy w zwi�zku z wadami, o kt�rych wspomnia�em. To czasem mo�emy chcie� go zastosowa� w celu
    optymalizacji naszej aplikacji. Gdy np. mamy du�o d�ugo �yj�cych obiekt�w, kt�rych inicjalizacja jest dosy� kosztowna.

    Kolejnym przyk�adem singleton�w s� beany springowe. Spring Framework tworzy domy�lnie beany jako singletony (ka�dy bean ma tylko jedn� instancj�).
    Pomaga to zoptymalizowa� tworzenie obiekt�w bean�w. Beany tworzone s� tylko przy starcie aplikacji. Dzi�ki czemu Garbage Collector ma du�o mniej pracy.
     */
    public static void main(String[] args) {

        SingletonExample singletonExample = SingletonExample.getInstance();
        System.out.println(singletonExample.hashCode());
    }
}
