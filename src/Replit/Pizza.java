package Replit;

public class Pizza {
    private String size;
    private int cheeseTopping, pepperoniTopping, hamTopping;

    public Pizza(String size, int cheeseTopping, int pepperoniTopping, int hamTopping) {
        this.size = size;
        this.cheeseTopping = cheeseTopping;
        this.pepperoniTopping = pepperoniTopping;
        this.hamTopping = hamTopping;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getCheeseTopping() {
        return cheeseTopping;
    }

    public void setCheeseTopping(int cheeseTopping) {
        this.cheeseTopping = cheeseTopping;
    }

    public int getPepperoniTopping() {
        return pepperoniTopping;
    }

    public void setPepperoniTopping(int pepperoniTopping) {
        this.pepperoniTopping = pepperoniTopping;
    }

    public int getHamTopping() {
        return hamTopping;
    }

    public void setHamTopping(int hamTopping) {
        this.hamTopping = hamTopping;
    }

    public String getDescription(){

        return size+" Pizza with " + cheeseTopping + " Cheese toppings, " +
                pepperoniTopping+ " Pepperoni toppings, and "+hamTopping+" Ham toppings"
                +"\nTotal Price: "+ calcCost();

    }

    public double calcCost(){
       if(size.equals("small")){
           return 10 + cheeseTopping*2+pepperoniTopping*2+hamTopping*2;
       }else if(size.equals("medium")){
           return 12 + cheeseTopping*2+pepperoniTopping*2+hamTopping*2;
       }else {
           return 14 + cheeseTopping*2+pepperoniTopping*2+hamTopping*2;
       }
    }





}
