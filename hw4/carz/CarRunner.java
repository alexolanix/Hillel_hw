package carz;

public class CarRunner {
    public static void main(String[] args) {
        Car[] cars = {
                new Car(1, "Subaru", "Impreza",
                        2016, "Silver",
                        16000, 10119),
                new Car(2, "Ford", "Mondeo",
                        2014, "Red",
                        10000, 10556),
                new Car(3, "Ford", "Mustang",
                        2018, "Yellow",
                        18000, 26687),
                new Car(4, "Doodge", "Viper",
                        2005, "Black",
                        5000, 10009),
                new Car(5, "Doodge", "Ram 1500",
                        2014, "Black",
                        20000, 22222),
                new Car(6, "Doodge", "Ram Big Horn",
                        2019, "Black",
                        40000, 10000)};

        CarProcessor one = new CarProcessor();

        one.printCars(cars, "Ford");
        one.printMakeElderYear(cars, "Viper", 3);
        one.printCarsYearHighPrice(cars, 2014, 5000);

    }
}
