package main.java.BuilderPattern.builders;

import main.java.BuilderPattern.cars.CarType;
import main.java.BuilderPattern.components.Engine;
import main.java.BuilderPattern.components.GPSNavigator;
import main.java.BuilderPattern.components.Transmission;
import main.java.BuilderPattern.components.TripComputer;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}