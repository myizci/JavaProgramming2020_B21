package Replit;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
       int[] a = {1,2,3,4,5};
       int[] b = {10,20,30,40};
        System.out.println(Arrays.toString(mergR(a,b)));
       }

    public static int[] mergR(int[] a,int[] b) {

int[] result = new int[a.length+b.length];

for(int i=0; i<a.length; i++){

   result[i]=a[i];
}

        for(int i=a.length; i<result.length; i++){

            result[i]=b[i-a.length];
        }

return result;
    }
}
