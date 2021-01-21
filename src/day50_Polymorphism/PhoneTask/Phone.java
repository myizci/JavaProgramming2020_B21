package day50_Polymorphism.PhoneTask;

public abstract class Phone {
    public String brand, model, size, color;
    public double price;

    public Phone(String brand, String model, String size, String color, double price) {

        if(price<0){
            throw new RuntimeException("Price cannot be negative");
        }


        this.brand = brand;
        this.model = model;
        this.size = size;
        this.color = color;
        this.price = price;
    }

    public abstract void texting();

    public abstract void calling();

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
