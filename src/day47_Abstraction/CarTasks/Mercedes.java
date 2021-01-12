package day47_Abstraction.CarTasks;

public class Mercedes extends Car {
    public Mercedes(String model, String color, int year, double price) {
        super("Mercedes", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println(brand  +" "+ model+" is starting with push button");
    }
    
}
