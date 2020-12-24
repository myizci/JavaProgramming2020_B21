package day33_ArrayList;

import java.util.ArrayList;

public class ListPractice1 {
    public static void main(String[] args) {

        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();

        for(int i=0; i<=100; i++){
            if(i%2!=0){
                odd.add(i);
            }else {
                even.add(i);
            }

        }

        System.out.println("odd numbers "+odd);
        System.out.println("even numbers"+even);

        System.out.println("last odd is "+odd.get(odd.size()-1));
        System.out.println("last even is "+even.get(even.size()-1));

        System.out.println("============================");

        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
        int[] arr3 = {20,30,40};
        int[] arr4 ={89,99,109};
        int[] arr5 = {71,72,73};

        int[][]arr2D = {arr1,arr2,arr3,arr4,arr5};

        ArrayList<Integer> list1 = new ArrayList<>();

        for(int[] each:arr2D){
            for(int element : each){
                list1.add(element);
            }
        }
//        for(int each:arr2){
//            list1.add(each);
//        }
        System.out.println(list1);
    }
}
