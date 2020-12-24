package day34_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class FrequencyOfChars {
    public static void main(String[] args) {
        String str = "AAABBCDDDDEEE"; //output A3B2C1D4E3

        String result ="";

        ArrayList<Character> list = new ArrayList<>();  //blank list

        for(int i = 0; i<str.length(); i++){

            list.add(str.charAt(i));
        } // Arraylist is filled with chars
       // System.out.println(list);


        for(int i=0; i<list.size(); i++){
            if(!result.contains(""+list.get(i))){

                result+=""+list.get(i)+ Collections.frequency(list, list.get(i));
            }
        }

        System.out.println( result);
    }
}
