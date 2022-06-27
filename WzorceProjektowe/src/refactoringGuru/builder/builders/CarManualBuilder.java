package refactoringGuru.builder.builders;

import refactoringGuru.builder.Cars.CarType;
import refactoringGuru.builder.components.Engine;
import refactoringGuru.builder.components.GPSNavigator;
import refactoringGuru.builder.components.Transmission;
import refactoringGuru.builder.components.TripComputer;

/**
 * Unlike other creational patterns, Builder can construct unrelated products,
 * which don't have the common interface.
 *
 * In this case we build a user manual for a car, using the same steps as we
 * built a car. This allows to produce manuals for specific car models,
 * configured with different features.
 */

public class CarManualBuilder implements Builder {
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    public CarManualBuilder(CarType type,
            int seats,
            Engine engine,
            Transmission transmission,
             TripComputer tripComputer,
             GPSNavigator gpsNavigator) {
        this.type = type;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public CarManualBuilder() {

    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }

    public int getSeats() {
        return seats;
    }

    @Override
    public void setCarType(CarType type) {

    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public TripComputer getTripComputer() {
        return tripComputer;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    public GPSNavigator getGpsNavigator() {
        return gpsNavigator;
    }

    @Override
    public void setGpsNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public CarManualBuilder getResult() {
        return new CarManualBuilder(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }

    public String print() {
        return "CarManualBuilder{" +
                "type=" + type +
                ", seats=" + seats +
                ", engine=" + engine +
                ", transmission=" + transmission +
                ", tripComputer=" + tripComputer +
                ", gpsNavigator=" + gpsNavigator +
                '}';
    }
}
