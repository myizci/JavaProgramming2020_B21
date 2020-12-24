package Office_Hours.Practice_11_26_2020;

import java.text.DecimalFormat;

public class MathPractice {
    public static void main(String[] args) {
       double a= Math.pow(2,3);
        System.out.println(a);

        System.out.println(Math.max(3,4.5));
        System.out.println(Math.min(1,2));


        int[] numbers = {1,2,3,4,5,6,7,8,9};

        int max = numbers[0];
        int min = numbers[0];

        for(int each: numbers){

            max = Math.max(max,each);
            min = Math.min(min,each);
        }
        System.out.println(max);
        System.out.println(min);

        System.out.println(Math.PI);
        System.out.println(Math.E);
        System.out.println(Math.sqrt(81));
        System.out.println(Math.IEEEremainder(4,6));
        System.out.println(Math.abs(2-6));
        DecimalFormat df = new DecimalFormat("0.00");
        double r1 = calculateCircleArea(3);
        System.out.println( df.format(r1));


        System.out.println(df.format(2.987));


        int num1=100;
        int r2 = Integer.parseInt((""+num1).substring(0,2));  // creates a string from a number

        System.out.println(r2);
    }

    public static double calculateCircleArea(double r){
        return Math.PI*Math.pow(r,2);
    }
}
