package extendsKlasyAbstrakcyjnej;

public class Klasa extends KlasaAbstrakcyjna {


    public Klasa(int s) {
        super(s);
    }

    @Override
    void metodaAbstrakcyjna() {
        System.out.println("Metoda abstrakcyjna w KlasaAbstrakcyjna");
    }
}
