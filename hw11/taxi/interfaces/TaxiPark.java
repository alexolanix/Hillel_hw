package taxi.interfaces;

public interface TaxiPark {
    void sortOfFuelConsumption();

    Car[] maximumSpeedRequest(int min, int max);

    int calculateCostOfTaxiPark();
}
