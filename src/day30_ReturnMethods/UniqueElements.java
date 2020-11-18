package day30_ReturnMethods;

public class UniqueElements {

    public static void main(String[] args) {
        String str = "aaaaabbbbcccgftry";
        System.out.println(frequencyOfCharacters(str));
        //System.out.println(unique(str));

    }


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


}