package Practice.GroupWork;

public class Replit178 {

    public static void main(String[] args) {
String one ="1235678910";
String two ="abcde";

        System.out.println(mergeStrings(one,two));
    }

    public static String mergeStrings(String one, String two){
        String result ="";

        if(one.length()<two.length()){  //one is shorter than two

          for(int i=0; i<one.length(); i++){
              result+=""+one.charAt(i)+two.charAt(i);  //1a2b3c +de
          }

          result+=two.substring(one.length());

        }else {
            for(int i=0; i<two.length(); i++){
                result+=""+one.charAt(i)+two.charAt(i);  //1a2b3c +de
            }

            result+=one.substring(two.length());

        }



        return result;
    }

}
