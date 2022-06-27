package interfejsIprzekazywanieObiektow;

public class WykonywczDzialan {

    int zwrocWynikDodawania(Kalkulator kalkulator) {
        return kalkulator.dodawanie();
    }

    int zwrocWynikOdejmowania(Kalkulator kalkulator) {
        return kalkulator.odejmowanie();
    }

    int zwrocWynikMnozenia(Kalkulator kalkulator) {
        return kalkulator.mnozenie();
    }
}
