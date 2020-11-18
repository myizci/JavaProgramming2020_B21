package Replit;

public class SplitPersonInfo {
    public static void main(String[] args) {
String k = "omer,toksoz,43";
person(k);
    }

    public static void person(String info){

        String[] words = info.split(",");

        System.out.println("person name: "+words[0]+" last name: "+ words[1]+ " age: "+words[2]);
    }
}
