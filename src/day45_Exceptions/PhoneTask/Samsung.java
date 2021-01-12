package day45_Exceptions.PhoneTask;

public final class Samsung extends Phone {
    public Samsung( String model, String country, double price) {
        super("Samsung", model, country, price);
    }

    public void freeze(){
        System.out.println(brand + " "+ model+" is freezing");
    }

}
