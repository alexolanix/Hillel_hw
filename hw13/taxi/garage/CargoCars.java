package taxi.garage;

import taxi.interfaces.Car;


public class CargoCars implements Car {
    int sizeOfTrunkCubicMeter;
    int carryingCapacity;
    String brand;
    String model;
    int yearOfManufacturing;
    int fuelConsumption;
    int price;
    int speedLimit;
    String type;


    public CargoCars(String brand, String model, int fuelConsumption, int speedLimit, int price, String type){
        this.brand = brand;
        this.model = model;
        this.fuelConsumption = fuelConsumption;
        this.speedLimit = speedLimit;
        this.price = price;
        this.type = type;
    }

    @Override
    public byte[] writeToFile() {
        return ("CargoCars: " +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", fuelConsumption=" + fuelConsumption +
                ", price=" + price +
                ", speedLimit=" + speedLimit +
                ", type='" + type +  ";\r\n").getBytes();
    }

    @Override
    public String toString() {
        return "CargoCars: " +
                "brand: " + brand + '\'' +
                ", model: " + model + '\'' +
                ", fuelConsumption: " + fuelConsumption +
                ", price: " + price +
                ", speedLimit: " + speedLimit +
                ", type: " + type + '\'';
    }

    public CargoCars(String brand, String model, int yearOfManufacturing, int fuelConsumption, int price, int speedLimit, int sizeOfTrunkCubicMeter, int carryingCapacity) {

        this.sizeOfTrunkCubicMeter = sizeOfTrunkCubicMeter;
        this.carryingCapacity = carryingCapacity;
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

    }

    @Override
    public int getFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    public int getSpeedLimit() {
        return speedLimit;
    }
}
