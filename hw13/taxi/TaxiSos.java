package taxi;

import taxi.garage.CargoCars;
import taxi.garage.Cars;
import taxi.garage.Minivan;
import taxi.interfaces.Car;
import taxi.taxiSos.OperatorTaxiSos;

import java.util.Arrays;
import java.util.Comparator;


public class TaxiSos {
    public static void main(String[] args) {
        Car[] cars = {new Cars("ford", "Mondeo", 2016, 5, 20000, 160, 4, true),
                new Cars("ford", "Escape", 2019, 12, 40000, 180, 5, true),
                new Cars("ford", "fiesta", 2014, 6, 10000, 140, 4, false),
                new CargoCars("ford", "transit", 2010, 10, 10000, 110, 3, 2),
                new CargoCars("ford", "caddy", 2015, 6, 13000, 130, 1, 2),
                new Minivan("volkswagen", "transporter", 2018, 7, 30000, 150, 8, false),
                new Minivan("volkswagen", "traveler", 2019, 6, 40000, 160, 6, true)};

//        OperatorTaxiSos sos = new OperatorTaxiSos(cars);
//        System.out.println("Общая оценка стоимости парка: " + sos.calculateCostOfTaxiPark());
        System.out.println("\n Сортировка по потреблению топлива: ");
        // sos.sortOfFuelConsumption();


        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car c1, Car c2) {

                return (int) c1.getFuelConsumption() - c2.getFuelConsumption();
            }
        });


//        Arrays.sort(cars, (c1,c2)->{
//            return  Integer.compare(c1.getFuelConsumption(),c2.getFuelConsumption());
//        });

  //      Arrays.sort(cars, Comparator.comparing(Car::getFuelConsumption));

        for(Car fuel: cars)
        System.out.println(fuel);



//        System.out.println();
//
//        System.out.println("\n Выборка по диапазону скорости: ");
//
//        Car[] max = sos.maximumSpeedRequest(50, 150);
//        for (Car p : max) {
//            System.out.println(p.toString());
//        }
    }


}
