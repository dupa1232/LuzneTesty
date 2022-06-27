package refactoringGuru.builder.director;

import refactoringGuru.builder.Cars.CarType;
import refactoringGuru.builder.builders.Builder;
import refactoringGuru.builder.components.Engine;
import refactoringGuru.builder.components.GPSNavigator;
import refactoringGuru.builder.components.Transmission;
import refactoringGuru.builder.components.TripComputer;

public class Director {

    public void constructSportCar(Builder builder) {
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0,0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGpsNavigator(new GPSNavigator());
    }

    public void constructCityCar(Builder builder) {
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2,0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGpsNavigator(new GPSNavigator());
    }

    public void constructSUV(Builder builder) {
        builder.setCarType(CarType.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5,0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setGpsNavigator(new GPSNavigator());
    }
}
