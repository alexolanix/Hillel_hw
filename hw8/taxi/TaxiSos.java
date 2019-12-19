package taxi;
import taxi.parammetric.Vehicle;
import taxi.garage.*;
import taxi.taxiOperational.Operator;


public class TaxiSos {
    public static void main(String[] args) {
        Vehicle[] cars = {new Cars("ford", "Mondeo", 2016, 5, 20000, 160, 4, true),
                new Cars("ford", "Escape", 2019, 12, 40000, 180, 5, true),
                new Cars("ford", "fiesta", 2014, 6, 10000, 140, 4, false),
                new CargoCars("ford", "transit", 2010, 10, 10000, 110, 3, 2),
                new CargoCars("ford", "caddy", 2015, 6, 13000, 130, 1, 2),
                new Minivan("volkswagen", "transporter", 2018, 7, 30000, 150, 8, false),
                new Minivan("volkswagen", "traveler", 2019, 6, 40000, 160, 6, true)};

        Operator sos = new Operator(cars);
        System.out.println("Общая оценка стоимости парка: " + sos.calculateCostOfTaxiPark());
        System.out.println("\n Сортировка по потреблению топлива: ");
        sos.sortOfFuelConsumption();
        for (Vehicle p: cars) {
            System.out.println(p.toString());
        }
        System.out.println();

        System.out.println("\n Выборка по диапазону скорости: ");

        Vehicle[] max = sos.maximumSpeedRequest(50, 150);
        for (Vehicle p : max) {
            System.out.println(p.toString());
        }
    }


}
