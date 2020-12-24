package day33_ArrayList;

import java.util.ArrayList;

public class ListIntro {
    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<>();

        scores.add(100); //index =0; Autoboxing, 100 is integer, once we put in arraylist, it is wrspper class Integer
        scores.add(90); // index=1;
        scores.add(0,80); // index=2;
        System.out.println(scores);

        ArrayList<String> groceryList = new ArrayList<>(); // egg, water, milk, bread,
 groceryList.add("Egg");
 groceryList.add("Water");
 groceryList.add("Milk");
 groceryList.add("Milkpowder");

 groceryList.add(0,"ToiletPaper");
 groceryList.add(1,"Sanitizer");
 groceryList.add(1,"N95 Mask");

        System.out.println(groceryList);
String item1= groceryList.get(2);

String item2 = groceryList.get(1);
        System.out.println(item1 + " "+ item2);
        System.out.println(groceryList.get(6));
        System.out.println(groceryList.size());

        System.out.println(groceryList.get(groceryList.size()-2));
    }
}
