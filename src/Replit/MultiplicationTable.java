package Replit;

import java.util.Arrays;

public class MultiplicationTable {
    public static void main(String[] args) {
        int [][] multiplicationTable = new int[10][10];

        //TODO: type your code below
        for(int i=0; i<=9; i++){
            for(int j=0; j<=9; j++){
                multiplicationTable[i][j]=(i+1)*(j+1);

            }
            System.out.println(Arrays.deepToString(multiplicationTable));
        }
    }
}
