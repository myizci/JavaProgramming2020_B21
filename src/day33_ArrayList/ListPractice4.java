package day33_ArrayList;

import java.util.ArrayList;

public class ListPractice4 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(10);
        list.add(40);
        list.add(10);
        list.add(50);

        int n1 = list.indexOf(10); //
        int n2 = list.lastIndexOf(10);

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(!list.contains(60));

        String str = "aabcc";
        String result = "";//

        System.out.println("==========================");

        ArrayList<Character> characters = new ArrayList<>();

        characters.add('A');
        characters.add('B');
        characters.add('C');
        characters.add('A');
        characters.add('C');
        characters.add('A');
        characters.add('B');
        characters.add('C');
        characters.add('A');
        characters.add('C');

        System.out.println(characters);

        ArrayList<Character> nonDup = new ArrayList<>();

        for (char each : characters) {
            if (!nonDup.contains(each)) {
                nonDup.add(each);
            }
        }
        System.out.println(nonDup);

        System.out.println("==========================================");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);


        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(1);
        list2.add(2);

        System.out.println(list1.equals(list2)); //com[ares values
        System.out.println(list1==list2); // compares they are the same array in th memory location


        System.out.println("=================================================");

        System.out.println(list1.isEmpty());
        System.out.println(list2.isEmpty());

        list1.clear();
        list2.clear();
        System.out.println("Lists are cleared");
        System.out.println(list1.isEmpty());
        System.out.println(list2.isEmpty());

    }
}
