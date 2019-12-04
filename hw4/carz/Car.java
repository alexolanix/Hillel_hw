package carz;

public class Car {
    int id;
    String make;
    String model;
    int manufacturingYear;
    String color;
    int price;
    int registrationNumber;

    public Car(int id, String make, String model, int manufacturingYear, 
                String color, int price, int registrationNumber) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.manufacturingYear = manufacturingYear;
        this.color = color;
        this.price = price;
        this.registrationNumber = registrationNumber;
    }
}
