package Replit;

import java.util.Arrays;

public class binary {
    public static void main(String[] args) {
        int[] binary = new int[8];
        int decimal = 45;

        for(int i=7;i>=0; i--){

            binary[i]=decimal%2;
            decimal/=2;
        }

        System.out.println(Arrays.toString(binary));
    }
}
