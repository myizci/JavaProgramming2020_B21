package Office_Hours.Practice_11_26_2020;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {
        String sentence = "Today is a great day to celebrate the thanksgiving by doing java tasks";

        String[] str = sentence.split(" ");

        String[] reverse = new String[str.length];

        for(int i=0; i<str.length; i++){

            reverse[i]=str[str.length-1-i];
        }

        System.out.println(Arrays.toString(reverse).trim());


    }
}
