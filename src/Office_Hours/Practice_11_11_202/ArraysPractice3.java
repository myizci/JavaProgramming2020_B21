package Office_Hours.Practice_11_11_202;

import java.util.Arrays;

public class ArraysPractice3 {
    public static void main(String[] args) {

        String str1 = "abc";
        String str2 = "GFED";

        str1= str1.toLowerCase();
        str2= str2.toLowerCase();

        String[] arr1 = str1.split("");
        String[] arr2 = str2.split("");



        Arrays.sort(arr1);
        Arrays.sort(arr2);//arrays are sorted in ascending order

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

Boolean isAnagram = Arrays.equals(arr1,arr2);
        System.out.println(isAnagram);
    }
}
