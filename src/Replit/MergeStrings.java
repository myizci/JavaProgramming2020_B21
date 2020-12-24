package Replit;

public class MergeStrings {
    public static void main(String[] args) {

        String a = "AliVeli";

        String b= "Mamadou";

        System.out.println(mergeStrings(b,a));

    }

    public static String mergeStrings(String one, String two) {
String result ="";

if(one.length()<two.length()){
    for(int i=0; i<one.length(); i++){

        result+=""+one.charAt(i)+two.charAt(i);
    }

    result+=two.substring(one.length());

}else{
    for(int i=0; i<two.length(); i++){

        result+=""+one.charAt(i)+two.charAt(i);
    }

    result+=one.substring(two.length());

}

return result;
    }
}
