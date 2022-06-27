package nullpointerexception.Factory;
/*

    Wzorzec ten mo�na spotka� pod dwiema postaciami fabryka abstrakcyjna (abstract factory) i metoda wytw�rcza (factory method).
    W obu przypadkach koncepcja jest taka sama, r�nica polega na tym, �e w pierwszym przypadku dzi�ki abstrakcji mo�emy wytworzy� obiekt
    dowolnego typu. Natomiast w drugim tworzymy zwykle obiekt konkretnego typu.

 */
public class Main {
    public static void main(String[] args) {

        CarFactory factory = new CarFactory();
        Car carWithDieselEngine = factory.createCarWithDieselEngine(2.3f);
        Car carWithPetrolEngine = factory.createCarWithPetrolEngine(2.0f);

        System.out.println(carWithDieselEngine);
        System.out.println(carWithPetrolEngine);
    }
}
