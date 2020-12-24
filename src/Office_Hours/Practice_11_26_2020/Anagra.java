package Office_Hours.Practice_11_26_2020;

import java.util.Arrays;

public class Anagra {
    public static void main(String[] args) {
        String str1="Listen";
        String str2="Silent";

        str1 = str1.toLowerCase();
        str2= str2.toLowerCase();

        String[]  arr1 = str1.split("");
        String[] arr2 = str2.split("");

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean isAnagram = Arrays.equals(arr1,arr2);


        System.out.println(isAnagram);

    }
}
