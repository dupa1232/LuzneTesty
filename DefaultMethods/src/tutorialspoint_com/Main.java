package tutorialspoint_com;

public class Main {

    /*
    W sumie zaczê³o siê wywalaæ, bo:
    Error: Unable to initialize main class tutorialspoint_com.Main1
    Caused by: java.lang.NoClassDefFoundError: tutorialspoint_com/vehicle (wrong name: tutorialspoint_com/Vehicle)

    I nie jestem przekonany, czy poni¿szy kod, który zakomentowa³em, ¿e nie dzia³a, faktycznie nie dzia³a³, bo te¿ zacz±³ powy¿szy b³±d dla niego lecieæ
     */

    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.print();

        //////// wywala siê poni¿sze, bo:
        /*

        // Error: Unable to initialize main class tutorialspoint_com.Main
        // Caused by: java.lang.NoClassDefFoundError: tutorialspoint_com/vehicle (wrong name: tutorialspoint_com/Vehicle)

        Vehicle vehicle1 = new Vehicle() {
            @Override
            public void print() {
                System.out.println("wehicle 1 !!!");
            }
        };
        vehicle1.print();
        */

//        System.out.println(vehicle.getClass());
    }
}

interface Vehicle {
    default void print() {
        System.out.println("i am a vehicle!");
    }

    static void blowHorn() {
        System.out.println("blowing horn!!!");
    }
}

interface FourWheeler {
    default void print() {
        System.out.println("i am a four wheeler!");
    }
}

class Car implements Vehicle, FourWheeler {

    @Override
    public void print() {
        Vehicle.super.print();
        FourWheeler.super.print();
        Vehicle.blowHorn();
        System.out.println("i am a car!");
    }
}




