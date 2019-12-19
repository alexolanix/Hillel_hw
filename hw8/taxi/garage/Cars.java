package taxi.garage;

import taxi.interfaces.Car;
import taxi.parammetric.Vehicle;

public class Cars extends Vehicle  {
    int quantityPassengers;
    boolean bigTrunk;
    String brand;
    String model;
    int yearOfManufacturing;
    int fuelConsumption;
    int price;
    int speedLimit;

    public Cars(String brand, String model, int yearOfManufacturing, int fuelConsumption, int price, int speedLimit, int quantityPassengers, boolean bigTrunk) {
        super(brand, model, yearOfManufacturing, fuelConsumption, price, speedLimit);

        this.quantityPassengers = quantityPassengers;
        this.bigTrunk = bigTrunk;
        this.brand = brand;
        this.model = model;
        this.yearOfManufacturing = yearOfManufacturing;
        this.fuelConsumption = fuelConsumption;
        this.price = price;
        this.speedLimit = speedLimit;
    }

    @Override
    public String toString() {
        return "\n" + "Cars{" +
                " brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearOfManufacturing = " + yearOfManufacturing +
                ", fuelConsumption = " + fuelConsumption +
                ", price=" + price +
                ", speedLimit = " + speedLimit +
                ", quantityPassengers = " + quantityPassengers +
                ", bigTrunk=" + bigTrunk +
                '}';
    }


}
