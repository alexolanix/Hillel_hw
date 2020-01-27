package taxi.garage;

import taxi.interfaces.Car;


public class Minivan implements Car {
    int extraPassengerPlace;
    boolean seatBeltsForAllPassengers;
    String brand;
    String model;
    int yearOfManufacturing;
    int fuelConsumption;
    int price;
    int speedLimit;
    String type;

    @Override
    public String toString() {
        return "Minivan: " +
                "brand: " + brand + '\'' +
                ", model: " + model + '\'' +
                ", fuelConsumption: " + fuelConsumption +
                ", price: " + price +
                ", speedLimit: " + speedLimit +
                ", type: " + type + '\'';
    }

    public Minivan(String brand, String model, int fuelConsumption, int speedLimit, int price, String type){
        this.brand = brand;
        this.model = model;
        this.fuelConsumption = fuelConsumption;
        this.speedLimit = speedLimit;
        this.price = price;
        this.type = type;
    }

    public Minivan(String brand, String model, int yearOfManufacturing, int fuelConsumption, int price, int speedLimit, int extraPassengerPlace, boolean seatBeltsForAllPassengers) {

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
    public byte[] writeToFile() {
        return ("Minivan: " +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", fuelConsumption=" + fuelConsumption +
                ", price=" + price +
                ", speedLimit=" + speedLimit +
                ", type='" + type + ";\r\n").getBytes();
    }

}
