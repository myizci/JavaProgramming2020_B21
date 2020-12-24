package day35_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class WarmUp2 {
    public static void main(String[] args) {

        String[] jobTitles = {"Doctor", "SDET", "QA", "Engineer", "QA"};

        ArrayList<String> jobs = new ArrayList<>();

        jobs.addAll(Arrays.asList(jobTitles));

        //jobs.retainAll(Arrays.asList("SDET","QA"));

        jobs.removeIf(p -> !p.equals("SDET") && !p.equals("QA"));

        System.out.println(jobs);

        System.out.println("===================");

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -2, -3, -4, -1, 0, -1, 1, 2, 3, 7, 8, 9));

        // only keep the numbers 7,8,9

        // numbers.retainAll(Arrays.asList(7,8,9));

        numbers.removeIf(p -> !(p == 7 || p == 8 | p == 9));
        System.out.println(numbers);

        ArrayList<Integer> numbers2 = new ArrayList<>();

        numbers2.addAll(Arrays.asList(1, 2, 3, 4, 500, 600, 7, 800, 900, 1000, 110, 120, -1, -2, -3, -4, -1, 0, -1, 1, 2, 3, 7, 8, 9));

        numbers2.removeIf(p -> p < 7);

        System.out.println("===================================");

        ArrayList<Integer> numbers3 = new ArrayList<>();

        numbers3.addAll(Arrays.asList(1, 2, 3, 4, 500, 600, 7, 800, 900, 1000, 110, 120, -1, -2, -3, -4, -1, 0, -1, 1, 2, 3, 7, 8, 9));
// solution 1

        numbers3.removeIf(p -> p > 100);
        System.out.println(numbers3);

        //solution 2

        ArrayList<Integer> temp = new ArrayList<>();
        for (int each : numbers3) {
            if (each < 100) {

                temp.add(each);
            }
        }
        System.out.println(numbers3);


    }
}
