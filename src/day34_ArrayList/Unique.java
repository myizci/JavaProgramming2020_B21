package day34_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Unique {
    public static void main(String[] args) {

        String str = "aabaacdddefffffghhhhhi";

        ArrayList<Character> list = new ArrayList<>(); // list is blank

        for(int i=0; i<str.length(); i++){

            list.add(str.charAt(i));
        }
//list ={ 'a',.......,'i'} str.lenght() =list.size()  list is full of chars from str
        for(int i=0; i<list.size(); i++){

            if(Collections.frequency(list,list.get(i))==1){
                System.out.println(list.get(i));
            }
        }
    }
}
