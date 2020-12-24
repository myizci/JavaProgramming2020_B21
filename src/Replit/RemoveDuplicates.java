package Replit;

public class RemoveDuplicates {

    public static void main(String[] args) {
        //test your code
        System.out.println(uniqueChars("wooden-spoon"));
        System.out.println(wordCount("ali bize geldi hos geldi"));
    }

    public static String uniqueChars(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            if(!result.contains(""+str.charAt(i))  ){
                  result+=str.charAt(i);
            }
        }
return result;
    }

    public static int wordCount(String words) {

String arr[]= words.split(" ");

return arr.length;
    }
}
