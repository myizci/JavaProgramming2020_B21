package Practice;

import java.util.Arrays;

public class ArrayToString {

    public static void main(String[] args) {
        String[] arr = {"zero", "one", "two", "three", "four"};


        int count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;


            for (int j = 0; j < arr[i].length(); j++) {

                if (arr[i].charAt(j) == 'e') {
                    count++;
                }
            }

            if (count > 0) {
                count2++;

            }
        }

        String[] fewValues = new String[count2];
        int index = count2;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;


            for (int j = 0; j < arr[i].length(); j++) {

                if (arr[i].charAt(j) == 'e') {
                    count++;
                }
            }

            if (count > 0) {

                if (count2 > 0) {

                    fewValues[index - count2] = arr[i];
                    count2--;

                }
            }
        }

        System.out.println(Arrays.toString(fewValues));
    }
}