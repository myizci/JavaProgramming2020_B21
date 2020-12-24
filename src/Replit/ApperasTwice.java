package Replit;

public class ApperasTwice {
    public static void main(String[] args) {
        String str1 = "HalidHalidHalid is waiting for Halid";
        String str2 = "Halid";
String model = "Extravagant";
int year = 2011;
boolean recalled = false;
       // System.out.println(appearsTwice(str2, str1));

        if((model.equals("Extravagant")&&(year>=2010&&year<=2012))||(model.equals("Guzzler")&&(year>=2015&&year<=2018))){
           recalled =true;
            System.out.println(recalled);
        }

    }

    public static boolean appearsTwice(String target, String sentence) {
        int count = 0;

        for (int i = 0; i < sentence.length() - target.length() + 1; i++) {
            if (sentence.substring(i, i + target.length()).equals(target)) {
                count++;
            }
        }

        return (count == 2);


    }
}
/*
 String[] words = sentence.split(" ");
        ArrayList<String> word = new ArrayList<>(Arrays.asList(words));
        int count=0;
        if(word.contains(target)){
            word.remove(target);
            count ++;
        }

        if(word.contains(target)){
            word.remove(target);
            count ++;
        }

        if(count==2){
            return true;
        }

return false;
 */