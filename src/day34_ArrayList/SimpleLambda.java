package day34_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

public class SimpleLambda {
    //Predicate
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6));

       /*
        for(int i=0; i<numbers.size(); i++){

            if(numbers.get(i)<5){
                numbers.remove(i)

            }
        }


        */
        //removeIf()

        Predicate<Integer> lessThan5 = each ->each<5;

        numbers.removeIf(lessThan5);
        System.out.println(numbers);

        System.out.println("==================================");
        ArrayList<Integer> numbers2 = new ArrayList<>();

        numbers2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6));

        numbers2.removeIf(element -> element<7);
        System.out.println(numbers2); //special for Alex

        System.out.println("=========================================");

        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,1,3,14,15,16,17,18,19,20));

        scores.removeIf(p ->p%3==0||p%5==0);
        System.out.println(scores);

        System.out.println("=======================================");

        ArrayList<String> employees2 = new ArrayList<>();

        employees2.addAll(Arrays.asList("Ahmed","Ahmed","Erjon", "Ahmed", "Ahmed", "Adil", "Afrooz"));

employees2.removeIf(p -> p.charAt(0)=='A'&&p!="Ahmed");
        System.out.println(employees2);

        System.out.println("=============================================");

        ArrayList<String> employees3 = new ArrayList<>();

        employees3.addAll(Arrays.asList("Ahmed","Ahmed","Emjon", "Ahmed", "Ahmed", "odil", "Afrooz"));

        employees3.removeIf(p-> p.toLowerCase().contains("a")||p.toLowerCase().contains("r"));
        System.out.println(employees3);

        System.out.println("====================================");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Tayfun", "Tayfun", "Adil", "Mustafa", "Mustafa", "Mike"));
        names.removeIf(p -> Collections.frequency(names, p) > 1);
        System.out.println(names);

        System.out.println("==========================");

        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('a', '1', 'b', '2', 'c', 'd', '$', '#', '@', '?', '*')  );
        System.out.println(chars);
        chars.removeIf( i -> Character.isDigit(i) || Character.isLetter(i)   );
        System.out.println(chars);


    }


}
