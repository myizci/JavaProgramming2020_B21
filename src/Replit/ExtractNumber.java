package Replit;

public class ExtractNumber {
    public static void main(String[] args) {
String kk = "1q2w3e4r";

        System.out.println(extractNum(kk));
    }

    public static String extractNum(String s){
String result = "";

        for(int i=0; i<s.length(); i++){

           if(Character.isDigit(s.charAt(i))){
               result += s.charAt(i);
           }
        }

return result;
    }
}
