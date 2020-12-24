package Replit;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineAL {
    public static void main(String[] args) {
        ArrayList<String> wordList1 = new ArrayList<>(Arrays.asList("Ali","Hasan"));
        ArrayList<String> wordList2 =  new ArrayList<>(Arrays.asList("Huseyin","Cafer"));

        combineAL(wordList1,wordList2);

        System.out.println(Arrays.toString(combineAL(wordList1,wordList2).toArray()));

    }

    public static ArrayList<String> combineAL(ArrayList<String> wordList1, ArrayList<String> wordList2){

ArrayList<String> result = new ArrayList<>();

result.addAll(wordList1);

result.addAll(wordList2);

return result;


    }





}
