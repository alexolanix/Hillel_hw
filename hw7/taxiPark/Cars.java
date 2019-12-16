package taxiPark;

public class Cars extends Vehicles {
    int quantityPassangers;
    boolean bigTrunk;

    public Cars(String brand, String model, int yearOfManufacturing, int fuelConsumption, int price, int speedLimit, int quantityPassengers, boolean bigTrunk) {
        super(brand, model, yearOfManufacturing, fuelConsumption, price, speedLimit);
        this.quantityPassangers = quantityPassengers;
        this.bigTrunk = bigTrunk;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "quantityPassangers = " + quantityPassangers +
                ", bigTrunk=" + bigTrunk +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearOfManufacturing = " + yearOfManufacturing +
                ", fuelConsumption = " + fuelConsumption +
                ", price=" + price +
                ", speedLimit = " + speedLimit +
                '}';
    }
}
