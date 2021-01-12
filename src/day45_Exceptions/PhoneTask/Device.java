package day45_Exceptions.PhoneTask;

public class Device {  // parent class cannot be "final", it becomes immutable, cannot be inherited!!!

    public String brand, model;
    public String country;
    public double price;

    Device(String brand, String model, String country, double price){ // constructor cannot be inherited!!!
        this.country = country;
        this.brand = brand;
        this.model = model;
        this.price =price;
    }

    @Override
    public String toString() { // we will override toString, so dont make it final
        return "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", country='" + country + '\'' +
                ", price=" + price +
                '}';
    }
}

