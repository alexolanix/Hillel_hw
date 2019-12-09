package carz;

public class CarRunnerMod {
    public static void main(String[] args) {
        CarM[] cars = {
                new CarM(1, "Subaru", "Impreza",
                        2016, "Silver",
                        16000, 10119),
                new CarM(2, "Ford", "Mondeo",
                        2014, "Red",
                        10000, 10556),
                new CarM(3, "Ford", "Mustang",
                        2018, "Yellow",
                        18000, 26687),
                new CarM(4, "Doodge", "Viper",
                        2005, "Black",
                        5000, 10009),
                new CarM(5, "Doodge", "Ram 1500",
                        2014, "Black",
                        20000, 22222),
                new CarM(6, "Doodge", "Ram Big Horn",
                        2019, "Black",
                        40000, 10000)
        };

        CarProcessorMod one = new CarProcessorMod(cars);
        CarProcessorMod two = new CarProcessorMod();

        one.printCarsM("Ford");
        // one.printCars(cars,"Ford");
        two.printMakeElderYearM("Viper", 3);
        //one.printMakeElderYear(cars, "Viper", 3);
        // one.printCarsYearHighPrice(cars, 2014, 5000);
        one.printCarsYearHighPriceM(2014, 5000);

    }
}
