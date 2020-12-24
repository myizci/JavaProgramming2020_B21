package Office_Hours.Practice_12_09_2020;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;

public class PizzaObjects {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.00");
        Pizza pizza1 = new Pizza();

        pizza1.customizeOrder("small",3,4,15);
        System.out.println(pizza1);

        System.out.println("=========================================================");

        Pizza[] cybertekPizza = new Pizza[175];

       for(int i=0; i<cybertekPizza.length; i++){
           Pizza pizza = new Pizza();
           pizza.customizeOrder("medium",3,4,20);
           cybertekPizza[i]=pizza;

       }
double total = 0;
        for(Pizza each: cybertekPizza){
           total+= each.totalPrice;

        }

        System.out.println("total = " + total);

       // System.out.println(Arrays.toString(cybertekPizza));

        System.out.println("====================================");

/*
medium 2 cheese 3 pep
large 3 cheese 4 pep
small 1 cheese 2 pep
 */

        ArrayList<Pizza> pizzas = new ArrayList<>();

        for(int i=0; i<60; i++){

            Pizza medium = new Pizza();

            medium.customizeOrder("medium",2,3,18);

            Pizza large = new Pizza();

            large.customizeOrder("medium",3,4,18);

            Pizza small = new Pizza();

            small.customizeOrder("small",1,2,18);

            pizzas.addAll(Arrays.asList(small,large,large));

        }
        System.out.println("Numnber of Pizzas: " + pizzas.size());

        double sum=0;

        for(Pizza each: pizzas){

            sum+= each.totalPrice;
        }

        System.out.println(df.format(sum));




    }
}
