package Builder.director;

import java.util.ResourceBundle;

import Builder.builders.Builder;
import Builder.cars.CarType;
import Builder.components.GPSNavigator;
import Builder.components.Transmission;
import Builder.components.TripComputer;
import Builder.components.Engine;

public class Director {
	public void constructSportsCar(Builder builder) {
		builder.setCarType(CarType.SPORTS_CAR);
		builder.setSeats(24);
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
		ResourceBundle applicationProperties = ResourceBundle.getBundle("car");
		CarType carType = CarType.valueOf(applicationProperties.getString("car.carType"));
		int numberOfSeats = Integer.parseInt(applicationProperties.getString("car.numberOfSeats"));
		int mileage = Integer.parseInt(applicationProperties.getString("car.engine.mileage"));
		float volume = Float.parseFloat(applicationProperties.getString("car.engine.volume"));
		Transmission transmission = Transmission.valueOf(applicationProperties.getString("car.transmission"));

		builder.setCarType(carType);
		builder.setSeats(numberOfSeats);
		builder.setEngine(new Engine(volume, mileage));
		builder.setTransmission(transmission);
		builder.setGPSNavigator(new GPSNavigator());
	}
}
