package taxi.garage;

import taxi.interfaces.Car;


public class Cars implements Car {
    int quantityPassengers;
    boolean bigTrunk;
    String brand;
    String model;
    int yearOfManufacturing;
    int fuelConsumption;
    int price;
    int speedLimit;
    String type;

    @Override
    public String toString() {
        return "Cars: " +
                "brand: " + brand + '\'' +
                ", model: " + model + '\'' +
                ", fuelConsumption: " + fuelConsumption +
                ", price: " + price +
                ", speedLimit: " + speedLimit +
                ", type: " + type + '\'';
    }

    public Cars(String brand, String model, int fuelConsumption, int speedLimit, int price, String type) {
        this.brand = brand;
        this.model = model;
        this.fuelConsumption = fuelConsumption;
        this.speedLimit = speedLimit;
        this.price = price;
        this.type = type;
    }

    public Cars(String brand, String model, int yearOfManufacturing, int fuelConsumption, int price, int speedLimit, int quantityPassengers, boolean bigTrunk) {


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
        return ("Cars: " +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", fuelConsumption=" + fuelConsumption +
                ", price=" + price +
                ", speedLimit=" + speedLimit +
                ", type='" + type + ";\r\n").getBytes();
    }
}
