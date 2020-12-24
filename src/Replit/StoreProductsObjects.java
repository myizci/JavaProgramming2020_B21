package Replit;

public class StoreProductsObjects {
    public static void main(String[] args) {


        StoreProducts sp = new StoreProducts("label1","cat1",12,true,30);

        System.out.println(sp.getDiscountedPrice(.3));
        sp.expired(false);

    }
}
