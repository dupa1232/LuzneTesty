package przekazywanieObiektowDoMetodDwukrotnieGlebiej;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Klasa klasa = new Klasa();

        StringBuilder stringBuilder = new StringBuilder("ass");
        klasa.metoda1(stringBuilder);
        System.out.println(stringBuilder.toString());
        /// zwroci:
        // "ass, czyli dupa"

        ////////////////////////////////////////////////////////
        Date date = new Date();
        System.out.println(date.getTime());
        klasa.metodaData1(date);
        System.out.println(date.getTime());
        /*
        Zwróci:
        1660674785325 //// mój dopisek w komentarzu, czyli data dzisiejsza.
        1000
         */

    }
}
