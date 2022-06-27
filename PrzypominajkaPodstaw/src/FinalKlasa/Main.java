package FinalKlasa;

/// klasa final nie mo¿e byæ dziedziczona, czyli nie mo¿emy jej extends
/// https://stackoverflow.com/questions/5181578/what-is-the-point-of-final-class-in-java
public class Main {
    public static void main(String[] args) {
        FinalKlasa.KlasaFinal klasaFinal = new KlasaFinal("klaaasaFinal");
        klasaFinal.drukujCos(); ///// klaaasaFinal

        Klasa2 klasa2 = new Klasa2(5);
        klasa2.drukujLiczbe(); /// 5
    }
}
