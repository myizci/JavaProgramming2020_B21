package Practice;

import java.util.Arrays;

public class CopyCertainValues2 {

    public static void main(String[] args) {
        System.out.println("-----EXAMPLE RUN ---------");
        String[] numbers = {"zero", "one", "two","three","four"};
        System.out.println(Arrays.toString(getWithE(numbers)));

    }



    public static String[] getWithE(String[] arr) {

        //TODO : YOUR CODE GOES HERE ----------------------

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



        //YOUR CODE ENDS HERE -----------------------

        return fewValues;
    }



}
