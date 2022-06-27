package kilkaSzczebliDziedziczenia;

public class KlasaC extends KlasaB {

    @Override
    public void metodaA() {
        super.metodaA();
        System.out.println("Dopisany szit po super.");
    }
}
