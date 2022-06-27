package nullpointerexception.Factory;

public class Car {

    private PetronEngine petronEngine;
    private DieselEngine dieselEngine;

    public Car(PetronEngine petronEngine) {
        this.petronEngine = petronEngine;
    }

    public Car(DieselEngine dieselEngine) {
        this.dieselEngine = dieselEngine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "petronEngine=" + petronEngine +
                ", dieselEngine=" + dieselEngine +
                '}';
    }
}
