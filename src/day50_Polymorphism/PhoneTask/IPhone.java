package day50_Polymorphism.PhoneTask;

public final class IPhone extends Phone implements AppleApps {
    public IPhone(String model, String size, String color, double price) {
        super("iPhone", model, size, color, price);
        if(price>1500){
            throw new RuntimeException("Invalid price, price cannot be more than $1500");
        }
    }

    @Override
    public void download() {
        System.out.println("downloading from: "+AppStoreName);
    }

    @Override
    public void texting() {
        System.out.println("Iphone is texting");
    }

    @Override
    public void calling() {
        System.out.println("Iphone is calling");
    }

    @Override
    public String toString() {
        return "IPhone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", OS='" + OS + '\'' +
                '}';
    }
}
