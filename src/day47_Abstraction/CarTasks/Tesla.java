package day47_Abstraction.CarTasks;

public class Tesla extends Car {
    public Tesla(String model, String color, int year, double price) {
        super("Tesla", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println(brand + " "+ model + " is starting with voice command");
    }
}
