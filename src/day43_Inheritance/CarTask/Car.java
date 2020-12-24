package day43_Inheritance.CarTask;

public class Car {

    public String brand, model, color, madeIn;
    public int year, miles;
    public double price;

    public static boolean hasEngine, hasWheels, hasTires;

    static {

        hasEngine = true;
        hasTires = true;
        hasWheels = true;
    }

    public void setInfo(String brand, String model, String color, String madeIn, int year, int miles, double price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.madeIn = madeIn;
        this.year = year;
        this.miles = miles;
        this.price = price;
    }

    public void drive(){
        System.out.println("driving "+brand + " " + model );

    }

    public void park(){
        System.out.println("parking "+brand + " " + model );

    }


    public String toString() {

        return year + " "+ brand + " "+model+ " "+color+ ", "+ miles +" miles, $"+(int)price;
    }

}
