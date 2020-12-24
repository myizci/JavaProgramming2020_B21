package Replit;

public class CountAppearance {
    public static void main(String[] args) {
String[] names = {"Halid","Nukhet", "Nimet","Salih","Halid","Halid"};
String son = "Halid";

        System.out.println(count_appearance(names,son));

    }

    public static int count_appearance(String[] arr, String word){

        int count=0;

        for(int i=0; i<arr.length; i++){

            if(word.equals(arr[i])){
                count++;
            }
        }

        //System.out.println(count);
        return count;

    }
}
