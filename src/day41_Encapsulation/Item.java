package day41_Encapsulation;

import java.text.DecimalFormat;

public class Item {
    public String name;
    public double unitPrice;
    public int quantity;

    public Item(String name, double unitPrice, int quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public double calcCost(){

        return quantity*unitPrice;
    }

    DecimalFormat df = new DecimalFormat("0.00");
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", total cost=" + df.format(calcCost()) +
                '}';
    }
}
