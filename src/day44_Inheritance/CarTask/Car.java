package day44_Inheritance.CarTask;

public class Car {
    private String brand, model, color;
    private double price;
    public int year;

    public Car(String brand, String model, String color, double price, int year) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.year = year;
    }

    public void start(){
        System.out.println("Insert the key and twist ignition key to start");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand: '" + brand + '\'' +
                ", model: '" + model + '\'' +
                ", color: '" + color + '\'' +
                ", price: $" + price +
                ", year: " + year +
                '}';
    }
}


