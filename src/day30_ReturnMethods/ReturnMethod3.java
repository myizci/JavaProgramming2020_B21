package day30_ReturnMethods;

import java.util.Arrays;

public class ReturnMethod3 {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};

        if(max(array)>10){
            System.out.println("it works");
        }else{
            System.out.println("alas!");
        }
    }

    public static int max(int[] arr){
        int result=arr[0];

for(int i=0; i<arr.length; i++){

    if(arr[i]>result){
        result=arr[i];
    }
}
        return result;
        // Nothing can be reached after return statement ;ex: System.out.println();
    }

public static int max2(int[] arr){

    Arrays.sort(arr);

    return arr[arr.length-1];
}

}
