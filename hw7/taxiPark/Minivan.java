package taxiPark;

public class Minivan extends Vehicles {
    int extraPassengerPlaice;
    boolean seatBeltsForAllPassengers = true;



    public Minivan(String brand, String model, int yearOfManufacturing, int fuelConsumption, int price, int speedLimit, int extraPassengerPlaice, boolean seatBeltsForAllPassengers) {
        super(brand, model, yearOfManufacturing, fuelConsumption, price, speedLimit);
        this.extraPassengerPlaice = extraPassengerPlaice;
        this.seatBeltsForAllPassengers = seatBeltsForAllPassengers;
    }

    @Override
    public String toString() {
        return "Minivan{" +
                "extraPassengerPlaice=" + extraPassengerPlaice +
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
