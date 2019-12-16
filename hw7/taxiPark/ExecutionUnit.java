package taxiPark;

import java.sql.Struct;
import java.util.Arrays;

public class ExecutionUnit {

    public static void main(String[] args) {
        Vehicles[] taxiPark = {new Cars("ford", "Mondeo", 2016, 5, 20000, 160, 4, true),
                new Cars("ford", "Escape", 2019, 12, 40000, 180, 5, true),
                new Cars("ford", "fiesta", 2014, 6, 10000, 140, 4, false),
                new CargoCars("ford", "transit", 2010, 10, 10000, 110, 3, 2),
                new CargoCars("ford", "caddy", 2015, 6, 13000, 130, 1, 1),
                new Minivan("volkswagen", "transporter", 2018, 7, 30000, 150, 8, false),
                new Minivan("volkswagen", "traveler", 2019, 6, 40000, 160, 6, true)};
        OperationArea x = new OperationArea(taxiPark);

        System.out.println(x.calculateCostOfTaxiPark());
        System.out.println();
        System.out.println(Arrays.toString(x.sortOfFuelConsumption()));
        System.out.println(x);
        System.out.println(Arrays.toString(x.maximumSpeedRequest(50, 150)));


        }
}
