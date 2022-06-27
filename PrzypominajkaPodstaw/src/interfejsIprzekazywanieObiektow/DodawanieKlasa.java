package interfejsIprzekazywanieObiektow;

public class DodawanieKlasa implements Kalkulator {

    private int a;
    private int b;

    @Override
    public int dodawanie() {
        return a+b;
    }

    @Override
    public int odejmowanie() {
        throw new IllegalArgumentException("Nie mozna tu odejmowac");
    }

    @Override
    public int mnozenie() {
        throw new IllegalArgumentException("Nie mozna tu mnozyæ!");
    }

    @Override
    public int dzielenie() {
        throw new IllegalArgumentException("Nie mozna tu dzielic");
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }
}
