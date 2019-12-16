package taxiPark;

public class OperationArea {
    private Vehicles[] result;

    public OperationArea(Vehicles[] result) {
        this.result = result;
    }

    public int calculateCostOfTaxiPark() {
        int sum = 0;
        for (Vehicles s : result) sum += s.price;
        return sum;
    }

    public Vehicles[] sortOfFuelConsumption() {
        int temp = 0;
        for (int k = 0; k < result.length; k++) {
            for (int l = k + 1; l < (result.length - 1); l++) {
                if (result[k].fuelConsumption > result[l].fuelConsumption) {
                    temp = result[k].fuelConsumption;
                    result[k].fuelConsumption = result[l].fuelConsumption;
                    result[l].fuelConsumption = temp;
                }
            }
        }
        return result;
    }

    public Vehicles[] maximumSpeedRequest(int min, int max) {

        Vehicles[] speedResult = {};
        int temp = 0;

        for (Vehicles speed : result) {
            if (speed.speedLimit > min && speed.speedLimit < max) {

                speedResult = writeToNewArray(speed, speedResult);

            }
        }
        return speedResult;
    }


    private Vehicles[] writeToNewArray(Vehicles res, Vehicles[] speedResult) {
        if (speedResult.length == 0) {
            return new Vehicles[]{res};

        } else {
            Vehicles[] newResArray = new Vehicles[speedResult.length + 1];
            for (int i = 0; i < speedResult.length; i++) {
                newResArray[i] = speedResult[i];
            }
            newResArray[speedResult.length] = res;
            return newResArray;
        }
    }
}
