package day50_Polymorphism.PhoneTask;

public final class Samsung extends Phone implements AndroidApps {
    public Samsung(String model, String size, String color, double price) {
        super("Samsung", model, size, color, price);

        if(price>1200){
            throw new RuntimeException("Samsung cannot be more than $1200");
        }
    }

    @Override
    public void download() {
        System.out.println("Samsung is downloading from: "+ AppStoreName);

    }

    @Override
    public void texting() {
        System.out.println("Samsung is texting");
    }

    @Override
    public void calling() {
        System.out.println("Samsung is calling");
    }

    @Override
    public String toString() {
        return "Samsung{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", OS='" + OS + '\'' +
                '}';
    }
}
