package refactoringGuru.builder.components;


import refactoringGuru.builder.Cars.Car;

public class TripComputer {
    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void showFuelLevel() {
        System.out.println("Fuel level: " +car.getFuel());
    }

    public void showStatus() {
        if (this.car.getEngine().isStarted())
            System.out.println("Car is started");
        else
            System.err.println("Car isnt started.");
    }
}
