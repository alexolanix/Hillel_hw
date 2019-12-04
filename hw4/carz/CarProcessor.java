package carz;

public class CarProcessor {

    void printCars(Car[] cars, String make) {
        int i;
        System.out.println("Ford cars:");
        for (i = 0; i < cars.length; i++) {
            if (cars[i].make == make) {
                System.out.println(" " + cars[i].id + ". " +
                    + cars[i].make + ":  " + cars[i].model);
            }
        }
    }


    void printMakeElderYear(Car[] cars, String model, int carAge) {
        int presentYear = 2019;
        System.out.println("Viper model elder " + carAge + " years:");
        for (int i = 0; i < cars.length; i++) {
            int realCarAge = presentYear - cars[i].manufacturingYear;
            if (realCarAge >= carAge && cars[i].model.equals(model)) {
                System.out.println(cars[i].id + ". " + cars[i].model + 
                    + " made in:  " + cars[i].manufacturingYear);
            }
        }
    }

    void printCarsYearHighPrice(Car[] cars, int yearOfManufacturing, int price) {
        System.out.println("Cars maiden in: " + yearOfManufacturing +  
            +" and price higher than: $" + price);
        for (Car checkCar : cars) {
            if (checkCar.manufacturingYear == yearOfManufacturing && checkCar.price > price) {
                System.out.println(checkCar.id + ". " + checkCar.make + " " + checkCar.model + " $" +
                        +checkCar.price + " " + checkCar.manufacturingYear + " " + checkCar.color);
            }
        }
    }
}
