package day30_ReturnMethods;

import Library.StringUtility;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "aabbcccc";

        System.out.println(frequencyOfCharacters2(str));

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



    }

