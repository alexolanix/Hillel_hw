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
    public String toString() {
        return "\n" + "CargoCars{" +
                " brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearOfManufacturing=" + yearOfManufacturing +
                ", fuelConsumption=" + fuelConsumption +
                ", price=" + price +
                ", speedLimit=" + speedLimit +
                ", sizeOfTrunkCubicMeter=" + sizeOfTrunkCubicMeter +
                ", carryingCapacity=" + carryingCapacity +
                '}';
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
