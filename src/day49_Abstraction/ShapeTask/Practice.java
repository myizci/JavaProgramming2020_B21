package day49_Abstraction.ShapeTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        list.forEach(p -> {
            if (p % 2 == 0) System.out.println(p);
        });

        list.forEach(p -> {
            if (p % 2 == 0) System.out.println(p + 2);
        });


        System.out.println("=======================================================");


        ArrayList<Integer> oddNumbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> greaterThan5 = new ArrayList<>();


        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13));

        numbers.forEach(p->{if(p%2==0) evenNumbers.add(p); else oddNumbers.add(p);});

        numbers.forEach(p->{if(p>5) greaterThan5.add(p);});

        System.out.println("evenNumbers = " + evenNumbers);
        System.out.println("oddNumbers = " + oddNumbers);
        System.out.println("greaterThan5 = " + greaterThan5);

    }
}
