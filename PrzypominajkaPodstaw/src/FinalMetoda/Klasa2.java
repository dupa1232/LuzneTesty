package FinalMetoda;

public class Klasa2 extends KlasaZmetodaFinal {

    @Override
    public void metodaNieFinal() {
        super.metodaNieFinal();
        System.out.println("metodaNieFInal, ale z nadpisanej klasy, czyli z Klasa2");
    }

    //// metoda metodaFinal() nie moze byc nadpisana, bo jest final!!!!!
//    public void metodaFinal() {
//
//    }
}
