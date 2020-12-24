package Office_Hours.Practice_12_09_2020;

public class Pizza {

    public String size;
    public int cheeseTopping, pepperoniTopping;
    public double priceOfPizza, tips,totalPrice;

    public void customizeOrder(String size, int cheeseTopping, int pepperoniTopping,double tips){
        this.size=size;
        this.cheeseTopping=cheeseTopping;
        this.pepperoniTopping = pepperoniTopping;

        priceOfPizza =calcCost();
        tips = tips/100;
        this.tips = tips*priceOfPizza;

        totalPrice = priceOfPizza + this.tips + (priceOfPizza*0.08);
    }

    public double calcCost(){
        double startingPrice = (size.equalsIgnoreCase("small"))?10:
        (size.equalsIgnoreCase("medium"))? 12:14;

        double cheese = 1*cheeseTopping;
        double pepperoni = 1.5*pepperoniTopping;

        return startingPrice+cheese+pepperoni;
    }

    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", cheeseTopping=" + cheeseTopping +
                ", pepperoniTopping=" + pepperoniTopping +
                ", priceOfPizza=" + priceOfPizza +
                ", tips=" + tips +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
