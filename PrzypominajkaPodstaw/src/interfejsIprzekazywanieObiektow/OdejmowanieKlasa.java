package interfejsIprzekazywanieObiektow;

public class OdejmowanieKlasa implements Kalkulator {
    private int a;
    private int b;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public int dodawanie() {
        throw new IllegalArgumentException("Nie mozna tu dodawac");
    }

    @Override
    public int odejmowanie() {
        return a-b;
    }

    @Override
    public int mnozenie() {
        throw new IllegalArgumentException("Nie mozna tu mnozyc");
    }

    @Override
    public int dzielenie() {
        throw new IllegalArgumentException("Nie mozna tu dzielic");
    }
}
