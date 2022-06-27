package interfejsIprzekazywanieObiektow;

public class MnozenieKlasa implements Kalkulator {
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
        throw new IllegalArgumentException("Nie mozna tu dodawaæ");
    }

    @Override
    public int odejmowanie() {
        throw new IllegalArgumentException("Nie mozna tu odejmowac");
    }

    @Override
    public int mnozenie() {
        return a*b;
    }

    @Override
    public int dzielenie() {
        throw new IllegalArgumentException("Nie mozna tu dzielic");
    }
}
