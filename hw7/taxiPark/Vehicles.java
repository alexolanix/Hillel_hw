package taxiPark;

public class Vehicles {
    String brand;
    String model;
    int yearOfManufacturing;
    int fuelConsumption;
    int price;
    int speedLimit;

    public Vehicles(String brand, String model, int yearOfManufacturing, int fuelConsumption, int price, int speedLimit) {
        this.brand = brand;
        this.model = model;
        this.yearOfManufacturing = yearOfManufacturing;
        this.fuelConsumption = fuelConsumption;
        this.price = price;
        this.speedLimit = speedLimit;
    }


}
