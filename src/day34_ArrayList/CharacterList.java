package day34_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class CharacterList {
    public static void main(String[] args) {
        String str = "abcd!@#$%^&123lkhgftry*()89";
     // digits={"a","b","c","d","!",.......
        //'a' ="a".charAt(0)
        ArrayList<String>  digits = new ArrayList<>(Arrays.asList(str.split("")));
// creates an arraylist and fills at the same time str.split("") creates a string array with one char
        System.out.println(digits);

        digits.removeIf(p->!Character.isDigit(p.charAt(0))); //lambda

        System.out.println(digits);

        ArrayList<String>  letters = new ArrayList<>(Arrays.asList(str.split("")));

        letters.removeIf(p->!Character.isLetter(p.charAt(0)));

        System.out.println(letters);

        ArrayList<String>  specials = new ArrayList<>(Arrays.asList(str.split("")));
       //specials.removeAll(digits);
       //specials.removeAll(letters);
        specials.removeIf(p-> Character.isLetterOrDigit(p.charAt(0)));  //Alex's choice
        System.out.println(specials);




    }
}
