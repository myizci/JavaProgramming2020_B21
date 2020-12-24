package day41_Encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {
    public static void main(String[] args) {

        ArrayList<Item> items =new ArrayList<Item>();
        Item item1 = new Item("pasta",1.24,3);
        Item item2 = new Item("water",3.33,1);
        Item item3 = new Item("oil",7.98,1);
        Item item4 = new Item("meat",6.99,10);
        Item item5 = new Item("tomato",1.24,7);

        items.addAll(Arrays.asList(item1,item2,item3,item4,item5));


       // System.out.println(items);

        double total=0;
        for(Item each:items){
            total += each.calcCost();

        }
        System.out.println(total);

    }








}
