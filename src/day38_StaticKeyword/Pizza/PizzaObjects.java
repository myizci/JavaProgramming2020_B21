package day38_StaticKeyword.Pizza;

public class PizzaObjects {

    public static void main(String[] args) {

        Pizza pizza = new Pizza();

      // pizza.customizeOrder();
        pizza.setInfo("medium",2,3,5);
        pizza.calcCost();
        System.out.println(pizza);
    }

}
