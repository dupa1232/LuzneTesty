package extendsKlasyAbstrakcyjnej;

public abstract class KlasaAbstrakcyjna {

    int s;

    abstract void metodaAbstrakcyjna();

    void metodaNieabstrakcyjna() {
        System.out.println("jeste¶my w metodzie nieabstrakcyjnej");
    }

    public KlasaAbstrakcyjna(int s) {
        this.s = s;
    }
}
