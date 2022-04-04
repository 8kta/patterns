package main.java.BuilderPattern.director;

import main.java.BuilderPattern.builders.Builder;
import main.java.BuilderPattern.cars.CarType;
import main.java.BuilderPattern.components.Engine;
import main.java.BuilderPattern.components.GPSNavigator;
import main.java.BuilderPattern.components.Transmission;
import main.java.BuilderPattern.components.TripComputer;

import java.util.ResourceBundle;

public class Director {
    private static final String FILENAME = "main.resources.car";

    public void constructSportsCar(Builder builder) {
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructCityCar(Builder builder) {
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructSUV(Builder builder) {
        builder.setCarType(CarType.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructProp(Builder builder) {
        ResourceBundle applicationProperties = ResourceBundle.getBundle(FILENAME);
        CarType carType = CarType.valueOf(applicationProperties.getString("car.carType"));
        int numberOfSeats = Integer.parseInt(applicationProperties.getString("car.numberOfSeats"));
        int mileage = Integer.parseInt(applicationProperties.getString("car.engine.mileage"));
        float volume = Float.parseFloat(applicationProperties.getString("car.engine.volume"));
        Transmission transmission = Transmission.valueOf(applicationProperties.getString("car.transmission"));

        builder.setCarType(carType);
        builder.setSeats(numberOfSeats);
        builder.setEngine(new Engine(volume,mileage));
        builder.setTransmission(transmission);
        builder.setGPSNavigator(new GPSNavigator());
    }
}

