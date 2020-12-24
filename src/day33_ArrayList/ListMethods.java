package day33_ArrayList;

import java.util.ArrayList;

public class ListMethods {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(100);
        list1.add(100);
        list1.add(200);
        list1.add(300);

        list1.set(1,400);

        System.out.println(list1);

        ArrayList<String> names = new ArrayList<>();
        names.add("Omer");
        names.add("Buket");
        names.add("Halid");
        names.add("Nukhet");
        names.add("Nukhet");
        names.add("Nimet");
        names.add("Nimet");
        names.add("Salih");
        names.add("Salih");
        System.out.println(names);

        names.set(4,"Nur");
        names.set(6,"Sena");
        names.set(8,"Furkan");
        System.out.println(names);

        ArrayList<Character> list = new ArrayList<>();

        list.add('A');
        list.add('B');
        list.add('C');
        list.add('D');
        list.add('E');
        System.out.println(list.size());
        System.out.println(list);
        list.remove(4);
        list.remove(1);
        System.out.println(list.size());
        System.out.println(list);

        System.out.println("=========================");
        ArrayList<Character> list2 = new ArrayList<>();

        list2.add('A');
        list2.add('B');
        list2.add('C');
        list2.add('D');
        list2.add('E');

        //Character ch = 'C';

        boolean r1 = list2.remove(Character.valueOf('C')); // valueof returns wrapper class, we can not pass'C' only!!!
        System.out.println(list2);
        System.out.println(r1);



    }
}
