package taxi.interfaces;

import taxi.parammetric.Vehicle;

public interface TaxiPark {
    void sortOfFuelConsumption();

    Vehicle[] maximumSpeedRequest(int min, int max);

    int calculateCostOfTaxiPark();
}
