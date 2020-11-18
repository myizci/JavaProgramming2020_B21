package day29_Methods;

public class ReverseString {
    public static void main(String[] args) {
        reverse("Aint nobody got time for that");

        String[] names = {"Halid","Nukhet","Nimet","Salih" };

        for(String each:names){

           reverse(each);
        }
    }

    public static void reverse(String word){
        String result="";
        for(int i=0; i<word.length(); i++){

          result +=word.charAt(word.length()-1-i);
        }
        System.out.println(result);
    }
}
