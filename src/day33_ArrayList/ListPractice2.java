package day33_ArrayList;

import java.util.ArrayList;

public class ListPractice2 {
    public static void main(String[] args) {
        ArrayList<Integer> list2  = new ArrayList<>();

        list2.add(1000);
        list2.add(200);
        list2.add(300);
        list2.add(400);
        list2.add(500);
        list2.add(600);

        int max = list2.get(0);
        int min = list2.get(0);

        for(int each:list2){
max= Math.max(each,max);
min = Math.min(each,min);

        }


        /*
        for(int i=0; i<list2.size();i++){

            if(list2.get(i)>max){
                max = list2.get(i);
            }
            if(list2.get(i)<min){
                min = list2.get(i);
            }
        }
         */
        System.out.println("max = " + max);
        System.out.println("min = " + min);

    }
}
