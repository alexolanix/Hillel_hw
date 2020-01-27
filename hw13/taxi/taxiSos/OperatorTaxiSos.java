package taxi.taxiSos;

import taxi.garage.Cars;
import taxi.interfaces.Car;
import taxi.interfaces.TaxiPark;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;


public class OperatorTaxiSos implements TaxiPark {
    Car[] result;


    public OperatorTaxiSos(Car[] result) {
        this.result = result;
    }


    @Override
    public void sortOfFuelConsumption() {
        Car temp;
        for (int k = 0; k < result.length; k++) {
            for (int l = k + 1; l < (result.length - 1); l++) {
                if (result[k].getFuelConsumption() > result[l].getFuelConsumption()) {
                    temp = result[k];
                    result[k] = result[l];
                    result[l] = temp;
                }
            }
        }

    }



    @Override
    public Car[] maximumSpeedRequest(int min, int max) {
        Car[] speedResult = {};
        for (Car speed : result) {
            if (speed.getSpeedLimit() > min && speed.getSpeedLimit() < max) {

                speedResult = writeToNewArray(speed, speedResult);

            }
        }
        return speedResult;
    }

    private Car[] writeToNewArray(Car res, Car[] speedResult) {
        if (speedResult.length == 0) {
            return new Car[]{res};

        } else {
            Car[] newResArray = new Car[speedResult.length + 1];
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
        for (Car s : result) {
            sum += s.getPrice();
        }
        return sum;
    }


}
