package Library;

import java.util.Arrays;

public class StringUtility {

    public static int frequency(String str, char ch) {

        int count = 0;

        for (char each : str.toCharArray()) {

            if (each == ch) {
                count++;
            }

        }

        return count;
    }


    public static String unique(String str) {
        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            int count = frequency(str, str.charAt(i));

            if (count == 1) {
                unique += str.charAt(i);
            }
        }
        return unique;

    }


    public static String frequencyOfCharacters(String str){
        String result="";

        for(int i=0; i<str.length(); i++){
            int count =0;
            for(int j=0; j<str.length(); j++){
                if(str.charAt(i)==str.charAt(j)){

                    count++;
                }

            }
            if(!result.contains(""+str.charAt(i))){

                result+=""+str.charAt(i)+count;
            }

        }



        return result;
    }

    public static String reverse(String str){
        String result = "";

        for(int i = str.length()-1; i >= 0; i--){
            result += str.charAt(i);
        }

        return result;
    }


    public static String removeDuplicates(String str){
        String result = "";  //"abc"

        for( int i = 0; i <= str.length()-1; i++  ){
            if(!result.contains( ""+str.charAt(i) )){
                result += str.charAt(i);
            }
        }

        return result;
    }

    public static String frequencyOfCharacters2(String str){

        String result ="";

        String nonDup = StringUtility.removeDuplicates(str);

        for(int i=0; i< nonDup.length();i++) {

            char ch = nonDup.charAt(i);
            int count = StringUtility.frequency(str, ch);

            result += "" + ch + count;
        }

        return result;
    }


    public static boolean isAnagram(String str1, String str2){
        str1 = removeDuplicates(str1);
        str2 = removeDuplicates(str2);
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str1.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
         boolean result=false;
        if(ch1.equals(ch2)){

             result = true;
        }

        return result;

    }

}
