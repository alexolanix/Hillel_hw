package taxi.taxiOperational;

import taxi.interfaces.TaxiPark;
import taxi.parammetric.Vehicle;


public class Operator implements TaxiPark {
    Vehicle[] result;

    public Operator(Vehicle[] result) {
        this.result = result;
    }

    @Override
    public void sortOfFuelConsumption() {
        int temp;
        for (int k = 0; k < result.length; k++) {
            for (int l = k + 1; l < (result.length - 1); l++) {
                if (result[k].fuelConsumption > result[l].fuelConsumption) {
                    temp = result[k].fuelConsumption;
                    result[k].fuelConsumption = result[l].fuelConsumption;
                    result[l].fuelConsumption = temp;
                }
            }
        }

    }

    @Override
    public Vehicle[] maximumSpeedRequest(int min, int max) {
        Vehicle[] speedResult = {};
        for (Vehicle speed : result) {
            if (speed.speedLimit > min && speed.speedLimit < max) {

                speedResult = writeToNewArray(speed, speedResult);

            }
        }
        return speedResult;
    }

    private Vehicle[] writeToNewArray(Vehicle res, Vehicle[] speedResult) {
        if (speedResult.length == 0) {
            return new Vehicle[]{res};

        } else {
            Vehicle[] newResArray = new Vehicle[speedResult.length + 1];
            for (int i = 0; i < speedResult.length; i++) {
                newResArray[i] = speedResult[i];
            }
            newResArray[speedResult.length] = res;
            return newResArray;
        }
    }

    @Override
    public int calculateCostOfTaxiPark() {
        int sum = 0;
        for (Vehicle s : result) {
            sum += s.price;
        }
        return sum;
    }
}
