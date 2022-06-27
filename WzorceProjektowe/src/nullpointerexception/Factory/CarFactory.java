package nullpointerexception.Factory;

public class CarFactory {

    public Car createCarWithDieselEngine(float capacity) {
        return new Car(new DieselEngine(capacity));
    }

    public Car createCarWithPetrolEngine(float capacity) {
        return new Car(new PetronEngine(capacity));
    }
}
