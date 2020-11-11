package Office_Hours.Practice_11_11_202;

import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        int[] arr1D = {1,2,3,4};
        int[][] arr2D = {{1,2,3,4},{4,5,6,},{9,7,6}};

        //System.out.println(arr2D[2]);
        System.out.println(Arrays.toString(arr2D[2]));
        System.out.println(Arrays.deepToString(arr2D));

        System.out.println("=========================");

        for(int[] each1DArray:arr2D){
            System.out.println(Arrays.toString(each1DArray));

            for(int eachElement: each1DArray){

                System.out.println(eachElement);
            }
        }
    }
}