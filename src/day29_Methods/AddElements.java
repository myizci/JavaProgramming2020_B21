package day29_Methods;

import java.util.Arrays;

public class AddElements {
    public static void main(String[] args) {
int a=30;
        int[] myArr ={1,2,3,8,0,-1};

        addElements(myArr,a);
    }

    public static void addElements(int[] arr, int num){

int[] result = new int[arr.length+1];

for(int i=0; i<arr.length; i++){

    result[i]=arr[i];
}

result[result.length-1]=num;

        System.out.println(Arrays.toString(result));

    }
}
