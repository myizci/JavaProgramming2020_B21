package Practice.GroupWork;

import java.util.ArrayList;
import java.util.Arrays;

public class replit199 {
    public static void main(String[] args) {

        ArrayList<String> iii = new ArrayList<>(Arrays.asList("Dragisa","Sladjan", "Natalie","Alex"));
        removeAll(iii,"Alex");
        System.out.println(Arrays.toString(iii.toArray())); // prints an arraylist

    }
    public static void removeAll(ArrayList<String> wordList, String targetWord){
        wordList.removeAll(Arrays.asList(targetWord));
    }
}

