package day47_Abstraction.CarTasks;

public class Toyota extends Car {
    public Toyota(String model, String color, int year, double price) {
        super("Toyota", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println(brand + " "+ model+ " starting by turning the key");
    }

}
