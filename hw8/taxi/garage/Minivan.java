package taxi.garage;

import taxi.interfaces.Car;
import taxi.parammetric.Vehicle;

public class Minivan extends Vehicle implements Car {
    int extraPassengerPlace;
    boolean seatBeltsForAllPassengers;
    String brand;
    String model;
    int yearOfManufacturing;
    int fuelConsumption;
    int price;
    int speedLimit;

    public Minivan(String brand, String model, int yearOfManufacturing, int fuelConsumption, int price, int speedLimit, int extraPassengerPlace, boolean seatBeltsForAllPassengers) {
        super(brand, model, yearOfManufacturing, fuelConsumption, price, speedLimit);
        this.extraPassengerPlace = extraPassengerPlace;
        this.seatBeltsForAllPassengers = seatBeltsForAllPassengers;
        this.brand = brand;
        this.model = model;
        this.yearOfManufacturing = yearOfManufacturing;
        this.fuelConsumption = fuelConsumption;
        this.price = price;
        this.speedLimit = speedLimit;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int getFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    public int getSpeedLimit() {
        return speedLimit;
    }

    @Override
    public String toString() {
        return "Minivan{" +
                "extraPassengerPlace=" + extraPassengerPlace +
                ", seatBeltsForAllPassengers=" + seatBeltsForAllPassengers +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearOfManufacturing=" + yearOfManufacturing +
                ", fuelConsumption=" + fuelConsumption +
                ", price=" + price +
                ", speedLimit=" + speedLimit +
                '}';
    }
}
