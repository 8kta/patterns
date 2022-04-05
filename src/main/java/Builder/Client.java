package Builder;

import Builder.builders.CarBuilder;
import Builder.builders.CarManualBuilder;
import Builder.cars.Car;
import Builder.cars.Manual;
import Builder.director.Director;

/**
 * Demo class. Everything comes together here.
 */
public class Client {

	public static void main(String[] args) {
		Director director = new Director();

		// Director gets the concrete builder object from the client
		// (application code). That's because application knows better which
		// builder to use to get a specific product.
		CarBuilder builder = new CarBuilder();
		director.constructCityCar(builder);

		// The final product is often retrieved from a builder object, since
		// Director is not aware and not dependent on concrete builders and
		// products.
		Car car = builder.getResult();
		System.out.println("Car built:\n" + car.getCarType());

		CarManualBuilder manualBuilder = new CarManualBuilder();

		// Director may know several building recipes.
		director.constructSportsCar(manualBuilder);
		Manual carManual = manualBuilder.getResult();
		System.out.println("\nCar manual built:\n" + carManual.print());

		//
		CarManualBuilder carBuilderProp = new CarManualBuilder();
		director.constructProp(carBuilderProp);

		Manual carProp = carBuilderProp.getResult();
		System.out.println("Car built by properties:\n" + carProp.print());
	}

}