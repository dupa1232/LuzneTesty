package FinalVariable;

public class KlasaZfinalVariable {

    final String zmienna;

    public KlasaZfinalVariable(String zmienna) {
        this.zmienna = zmienna;
    }

    // Zmienna final powinna by� pisana "upper case", gdzie spacje s� pod�ogami -> _
    // Zmienna final musi byc zainicjalizowana w czasie deklaracji, albo najpozniej w konstruktorze
    public void metoda() {
        final int i = 0;
//        i = i+1; /// Variables marked as final can't be reassigned. Once a final variable is initialized, it can?t be altered.!!!!!
    }
}
