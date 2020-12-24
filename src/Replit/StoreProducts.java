package Replit;

public class StoreProducts {
    private String label, category;
    private double price;
    private boolean hasExpiration;
    private int stock;

    public StoreProducts(String label, String category, double price, boolean hasExpiration, int stock) {
        this.label = label;
        this.category = category;
        this.price = price;
        this.hasExpiration = hasExpiration;
        this.stock = stock;
    }

    public StoreProducts(String label, double price, int stock) {
        this.label = label;
        this.price = price;
        this.stock = stock;
        this.category = "misc";
        this.hasExpiration = false;
    }

    public StoreProducts(String label, double price) {
        this.label = label;
        this.price = price;
        this.stock = 0;
        this.category = "misc";
        this.hasExpiration = false;
    }


    public StoreProducts(String label, String category, double price, boolean hasExpiration) {
        this.label = label;
        this.category = category;
        this.stock = 0;
        this.price = price;
        this.hasExpiration = hasExpiration;
    }

    public void expired(boolean hasExpired) {
        if (hasExpiration && hasExpired) {
            this.stock = 0;
        }
    }


    public boolean sale(int quantity) {

        if (quantity <= stock) {
            stock -= quantity;
            return true;
        }
        return false;
    }



    public double getDiscountedPrice(double discount){
        if(discount>=0.1&&discount<=1){
            return price *(1-discount);
        }
        return -1;
    }





}
