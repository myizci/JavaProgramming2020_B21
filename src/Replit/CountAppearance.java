package Replit;

public class CountAppearance {
    public static void main(String[] args) {
String[] names = {"Halid","Nukhet", "Nimet","Salih","Halid"};
String son = "Halid";

count_appearance(names,son);

    }

    public static int count_appearance(String[] arr, String t){

        int count=0;

        for(int i=0; i<arr.length; i++){

            if(t.equals(arr[i])){
                count++;
            }
        }System.out.println(count);
        return count;

    }
}
