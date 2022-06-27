package FinalKlasa;

/////// nie mo¿na dziedziczyc po klasie final!!!!
public class Klasa2 //extends KlasaFinal
{
//    public Klasa2(String name) {
//        super(name);
//    }

    private int liczba;

    public Klasa2(int liczba) {
        this.liczba = liczba;
    }

    public void drukujLiczbe() {
        System.out.println(this.liczba);
    }
}
