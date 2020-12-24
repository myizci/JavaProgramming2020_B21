package day34_ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class CollectionUtility {
    public static void main(String[] args) {
        ArrayList<Character> chars = new ArrayList<>();

        chars.add('X');
        chars.add('Z');
        chars.add('Y');
        chars.add('W');
        chars.add('A');

        Collections.sort(chars);
        System.out.println(chars);

        ArrayList<Integer> scores = new ArrayList<>();

        scores.add(70);
        scores.add(80);
        scores.add(60);
        scores.add(90);
        scores.add(55);
        scores.add(95);
        scores.add(70);
        scores.add(45);
        scores.add(15);
        System.out.println(scores);

        Collections.swap(scores,3,2); //swaps two elements

        System.out.println(scores);

        Collections.sort(scores);
        System.out.println(scores);
        Collections.swap(scores,0,scores.size()-1);
        // String str.lenght() // Array arr.length // Array list.size() //
        System.out.println(scores);

        Collections.swap(scores,scores.indexOf(60),scores.lastIndexOf(70));
        System.out.println(scores);

        Collections.replaceAll(scores,70,44);
        System.out.println(scores);


        int min = scores.get(0);
        int max = scores.get(scores.size()-1);

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("==============================");

        ArrayList<Character> list = new ArrayList<>();

        list.add('A');
        list.add('B');
        list.add('C');
        list.add('A');
        list.add('@');
        list.add('A');
        list.add('A');
        list.add('A');
        System.out.println(list);
//        for(int i=0; i<list.size(); i++){
//
//            char each = list.get(i);
//            if(each=='A'){
//                list.set(i,'E');
//            }
//        }

        Collections.replaceAll(list,'A','E');

        System.out.println(list);

        System.out.println(Collections.frequency(list,'E'));


        System.out.println(Collections.max(scores));
        System.out.println(Collections.min(scores));
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
    }
}
