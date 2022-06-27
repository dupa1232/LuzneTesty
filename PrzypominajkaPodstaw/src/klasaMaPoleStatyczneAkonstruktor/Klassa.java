package klasaMaPoleStatyczneAkonstruktor;

public class Klassa {

    static int a;
    String b;

    public Klassa(int a, String b) {
        /// nie ma problemu z przypisaniem warto¶ci do statycznej
        // zmiennej, ale nie podpowiada automat takiego uzupe³nienia
        this.a = a;
        this.b = b;
    }
    // jak widaæ, gettery i settery te¿ mo¿na ustawiaæ
    public static int getA() {
        return a;
    }

    public static void setA(int a) {
        Klassa.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }
}
