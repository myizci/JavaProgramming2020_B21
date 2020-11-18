package Replit;

import java.util.Arrays;

public class FrontPiece {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7};
 int l = num.length;

 if(l<2){
     System.out.println(Arrays.toString(num));
 }else{

     int[] num2={num[0],num[1]};
     System.out.println(Arrays.toString(num2));
 }

    }
}
