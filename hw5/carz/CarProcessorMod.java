package carz;

import java.util.Arrays;

public class CarProcessorMod {
    CarM[] mod;

    private String make;

    CarProcessorMod(CarM[] cars) {
        CarM[] mod = Arrays.copyOf(cars, cars.length);
        this.mod = mod;

    }

    CarProcessorMod() {
        CarM[] mod = new CarM[0];
        this.mod = mod;

    }


    void printCars(CarM[] cars, String make) {


        System.out.println("Ford cars:");
        for (CarM car : cars) {
            if (car.make.equals(make)) {
                print(car);
                // System.out.println(" " + car.id + ". " + car.make + ":  " + car.model);
            }
        }
    }

    void printCarsM(String make) {
        if (mod.length == 0) {
            System.out.println("Inner Array is empty");
        } else {
            for (CarM car : mod) {
                if (car.make.equals(make)) {
                    print(car);
                    //  System.out.println(" " + car.id + ". " + car.make + ":  " + car.model);
                }
            }
        }
    }


    void printMakeElderYear(CarM[] mod, String model, int carAge) {
        int presentYear = 2019;
        System.out.println("Viper model elder " + carAge + " years:");
        for (CarM car : mod) {
            int realCarAge = presentYear - car.manufacturingYear;
            if (realCarAge >= carAge && car.model.equals(model)) {
                print(car);
                // System.out.println(cars[i].id + ". " + cars[i].model + " made in:  " + cars[i].manufacturingYear);
            }
        }
    }

    void printMakeElderYearM(String model, int carAge) {
        int presentYear = 2019;
        System.out.println("Viper model elder " + carAge + " years:");
        if (mod.length == 0) {
            System.out.println("Inner array is empty");
        } else {
            for (CarM car : mod) {
                int realCarAge = presentYear - car.manufacturingYear;
                if (realCarAge >= carAge && car.model.equals(model)) {
                    print(car);
                    // System.out.println(cars[i].id + ". " + cars[i].model + " made in:  " + cars[i].manufacturingYear);
                }
            }
        }

    }

    void printCarsYearHighPrice(CarM[] cars, int yearOfManufacturing, int price) {
        System.out.println("Cars maiden in: " + yearOfManufacturing + " and price higher than: $" + price);
        for (CarM car : cars) {
            if (car.manufacturingYear == yearOfManufacturing && car.price > price) {
                print(car);
                //  System.out.println(checkCar.id + ". " + checkCar.make + " " + checkCar.model + " $" +
                //          +checkCar.price + " " + checkCar.manufacturingYear + " " + checkCar.color);
            }
        }
    }

    void printCarsYearHighPriceM(int yearOfManufacturing, int price) {
        System.out.println("Cars maiden in: " + yearOfManufacturing + " and price higher than: $" + price);
        if (mod.length == 0) {
            System.out.println("Inner array is empty");
        } else {
            for (CarM car : mod) {
                if (car.manufacturingYear == yearOfManufacturing && car.price > price) {
                    print(car);
                    //  System.out.println(checkCar.id + ". " + checkCar.make + " " + checkCar.model + " $" +
                    //          +checkCar.price + " " + checkCar.manufacturingYear + " " + checkCar.color);
                }
            }
        }
    }

    void print(CarM cars) {
        System.out.println(cars.id + ". " + cars.make + " " + cars.model + " $" +
                +cars.price + " " + cars.manufacturingYear + " " + cars.color);
    }
}
