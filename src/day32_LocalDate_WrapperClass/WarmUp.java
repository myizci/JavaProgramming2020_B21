package day32_LocalDate_WrapperClass;

import java.util.Arrays;

public class WarmUp {
    public static void main(String[] args) {
       int[] err = {1,2,3,4,5};
       int t= 6;

       double[] urr = {1.2, 4.0, 6.7};
       double murr = 9.0;

       String[] names = {"Halid", "Nukhet","Nimet","Salih" };
       String mom = "Buket";

       char[] dad = {'o','m','e','r'};

       char last = 't';

        System.out.println(Arrays.toString(addElements(err,t)));
        System.out.println(Arrays.toString(addElements(urr,murr)));
        System.out.println(Arrays.toString(addElements(names,mom)));
        System.out.println(Arrays.toString(addElements(dad,last)));

    }

    public static int[] addElements(int[] arr, int val){
        int[] result = new int[arr.length+1];

        for(int i=0; i<arr.length; i++){

            result[i]=arr[i];
        }
        result[result.length-1]=val;


        return result;
    }

    public static double[] addElements(double[] arr, double val){
        double[] result = new double[arr.length+1];

        for(int i=0; i<arr.length; i++){

            result[i]=arr[i];
        }
        result[result.length-1]=val;


        return result;
    }

    public static String[] addElements(String[] arr, String val){
        String[] result = new String[arr.length+1];

        for(int i=0; i<arr.length; i++){

            result[i]=arr[i];
        }
        result[result.length-1]=val;


        return result;
    }

    public static char[] addElements(char[] arr, char val){
        char[] result = new char[arr.length+1];

        for(int i=0; i<arr.length; i++){

            result[i]=arr[i];
        }
        result[result.length-1]=val;


        return result;
    }
}
