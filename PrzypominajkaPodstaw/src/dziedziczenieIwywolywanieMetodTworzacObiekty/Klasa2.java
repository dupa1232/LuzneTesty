package dziedziczenieIwywolywanieMetodTworzacObiekty;

public class Klasa2 extends Klasa1 {
    @Override
    public void metodaWklasie1DoNadpisania() {
        super.metodaWklasie1DoNadpisania();
        System.out.println("zawartosc po nadpisaniu!");
    }

    public void metodaWklasie2() {
        System.out.println("metoda w klasie 2!");
    }
}
