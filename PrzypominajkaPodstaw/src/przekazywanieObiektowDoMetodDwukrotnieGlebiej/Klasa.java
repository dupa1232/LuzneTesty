package przekazywanieObiektowDoMetodDwukrotnieGlebiej;

import java.util.Date;

public class Klasa {

    void metoda1(StringBuilder stringBuilder) {
        metoda2(stringBuilder);
    }

    void metoda2(StringBuilder stringBuilder) {
        stringBuilder.append(", czyli dupa");
    }

    void metodaData1(Date date) {
        metodaData2(date);
    }

    void metodaData2(Date date) {
        date.setTime(1000);
    }
}
