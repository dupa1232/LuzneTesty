package nullpointerexception.Singleton;

public class Main {
    /*
    Kolejny bardzo popularny wzorzec to singleton. S³u¿y on do zapewnienia, ¿e dany obiekt zostanie stworzony tylko raz. Ma to na celu
    ograniczenie ilo¶ci obiektów tworzonych w aplikacji. Czêsto Singleton okre¶lany jest anty wzorcem poniewa¿ ³amie on zasady programowania
    obiektowego (wprowadza globalny stan). A tak¿e mo¿e znacz±co utrudniæ testowanie.

    Mimo, ¿e singleton mo¿e sprawiaæ nam pewne problemy w zwi±zku z wadami, o których wspomnia³em. To czasem mo¿emy chcieæ go zastosowaæ w celu
    optymalizacji naszej aplikacji. Gdy np. mamy du¿o d³ugo ¿yj±cych obiektów, których inicjalizacja jest dosyæ kosztowna.

    Kolejnym przyk³adem singletonów s± beany springowe. Spring Framework tworzy domy¶lnie beany jako singletony (ka¿dy bean ma tylko jedn± instancjê).
    Pomaga to zoptymalizowaæ tworzenie obiektów beanów. Beany tworzone s± tylko przy starcie aplikacji. Dziêki czemu Garbage Collector ma du¿o mniej pracy.
     */
    public static void main(String[] args) {

        SingletonExample singletonExample = SingletonExample.getInstance();
        System.out.println(singletonExample.hashCode());
    }
}
