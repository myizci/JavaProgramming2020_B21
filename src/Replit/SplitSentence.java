package Replit;

import java.util.Scanner;

public class SplitSentence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String[] arr = sentence.split(" ");
        int l = arr.length;

        String[] arr2=new String[arr.length];

        for(int i=0; i<=l-1; i++){

            arr2[i]=arr[l-1-i];
            System.out.println(arr2[i]);
        }
    }
}
