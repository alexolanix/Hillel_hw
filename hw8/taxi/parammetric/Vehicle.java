package taxi.parammetric;

public class Vehicle {
    public int price;
    String brand;
    String model;
    public  int yearOfManufacturing;
   public int fuelConsumption;

   public int speedLimit;


    public Vehicle(String brand, String model, int yearOfManufacturing, int fuelConsumption, int price, int speedLimit) {
        this.brand = brand;
        this.model = model;
        this.yearOfManufacturing = yearOfManufacturing;
        this.fuelConsumption = fuelConsumption;
        this.price = price;
        this.speedLimit = speedLimit;
    }


}
