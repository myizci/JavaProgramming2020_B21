package day44_Inheritance.CarTask;

public class Honda extends Car {
private int cylinder;  //4 or 6 this is only for honda


    public Honda( String model, String color, double price, int year,int cylinder) {
        super("Honda", model, color, price, year);
        this.cylinder=cylinder;
    }

    @Override
    public String toString() {
      return  "This car.kjbckjdsbcvkjdsbncvkldsbn has "+cylinder + " cylinders";
    }
}
