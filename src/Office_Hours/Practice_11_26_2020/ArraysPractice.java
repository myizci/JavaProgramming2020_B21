package Office_Hours.Practice_11_26_2020;

import java.util.ArrayList;

public class ArraysPractice {

    public static void main(String[] args) {
        int[] numbers = new int[50];

        for(int i=0; i<=numbers.length-1; i++){

            numbers[i]= i+1;
        }

        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();

        for(int each:numbers){
            if(each%2==0){
                even.add(each);
            }else{
                odd.add(each);
            }
        }
        System.out.print("Odd: "+ odd);
        System.out.println();
        System.out.print("Even "+ even);
    }
}

