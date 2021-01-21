package day47_Abstraction.CarTasks;

public class BMW extends Car {
    public BMW(String model, String color, int year, double price) {
        super("BMW", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println(brand + " "+ model + " is broken");
    }
}
