package taxiPark;

public class CargoCars extends Vehicles {
    int sizeOfTrunkCubicMeter;
    int carryingCapacity;

    public CargoCars(String brand, String model, int yearOfManufacturing, int fuelConsumption, int price, int speedLimit, int sizeOfTrunkCubicMeter, int carryingCapacity) {
        super(brand, model, yearOfManufacturing, fuelConsumption, price, speedLimit);
        this.sizeOfTrunkCubicMeter = sizeOfTrunkCubicMeter;
        this.carryingCapacity = carryingCapacity;
    }

    @Override
    public String toString() {
        return "CargoCars{" +
                "sizeOfTrunkCubicMeter=" + sizeOfTrunkCubicMeter +
                ", carryingCapacity=" + carryingCapacity +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearOfManufacturing=" + yearOfManufacturing +
                ", fuelConsumption=" + fuelConsumption +
                ", price=" + price +
                ", speedLimit=" + speedLimit +
                '}';
    }
}
