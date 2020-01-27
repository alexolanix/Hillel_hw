package taxi.interfaces;

import taxi.garage.Cars;

public interface TaxiPark {
    void sortOfFuelConsumption();
   // int sortOfFuelConsumption(Cars c1, Cars c2);

    Car[] maximumSpeedRequest(int min, int max);

    int calculateCostOfTaxiPark();


}
