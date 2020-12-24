package day43_Inheritance.CarTask;

public class Toyota extends Car {

    public static boolean isAffordable;
    public static boolean isImmortal;

    static {
        isAffordable = true;
        isImmortal = false;
    }

    public Toyota(String model, String color, int year, int miles, double price) {
        setInfo(brand="Toyota",model,color,"Japan",year, miles,price );
    }
}
