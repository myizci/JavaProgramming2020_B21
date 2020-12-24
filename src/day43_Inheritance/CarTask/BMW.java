package day43_Inheritance.CarTask;

public class BMW extends Car{

    public static boolean isExpensive;
    public static boolean isLuxury;

    static {
        isExpensive = true;
        isLuxury = true;
    }



    public BMW(String model, String color, int year, int miles, double price) {
        setInfo(brand="BMW",model,color,"Germany",year, miles,price );
    }

    public void race(){
        System.out.println(brand + " "+ model + " is racing");
    }
}
