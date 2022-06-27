package refactoringGuru.builder.builders;

import refactoringGuru.builder.Cars.CarType;
import refactoringGuru.builder.components.Engine;
import refactoringGuru.builder.components.GPSNavigator;
import refactoringGuru.builder.components.Transmission;
import refactoringGuru.builder.components.TripComputer;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGpsNavigator(GPSNavigator gpsNavigator);
}
