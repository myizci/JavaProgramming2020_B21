package Replit;

import java.util.Arrays;

public class PrintFirstLastChar2 {
    public static void main(String[] args) {

        String[] words = {"hello", "why", "by", "apple" , "note"};

        int l= words.length;

        String[] result = new String[l];

        for(int i=0; i<l; i++){

            result[i]=""+words[i].charAt(0)+words[i].charAt(words[i].length()-1);
        }

        System.out.println(Arrays.toString(result));
    }
}
