package Replit;

public class Array2DLargestNumber {
    public static void main(String[] args) {
        int[][] arr ={{1,24,3,},{4,5,6}};

        int max = arr[0][0];

        for(int[] each:arr){
            for(int element:each){
                if(element>max){
                    max = element;
                }
            }
        }

        System.out.println(max);
    }
}
