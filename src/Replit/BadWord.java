package Replit;

public class BadWord {
    public static void main(String[] args) {
String word = "one two three two four";
String bad = "two";

        System.out.println(clean(word,bad));
    }

    public static String clean (String text ,String badWord) {

while(text.contains(badWord)){
   text = text.replaceAll(badWord,"");
}
return text;
    }
}
