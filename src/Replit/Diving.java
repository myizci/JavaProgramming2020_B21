package Replit;

import java.util.Arrays;
import java.util.Scanner;

public class Diving {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] score = new float[7];
        float dif=0;
float total= 0;
        for(int i=0; i<7; i++){
            System.out.println("Enter score for judge " +(i+1)+":");
            score[i]=input.nextFloat();

        }

        System.out.println("Enter difficulty:");
        dif=input.nextFloat();

        Arrays.sort(score);
float sum=0;
        for(int i=1; i<score.length-1; i++){
            sum+=score[i];
        }
total = sum*dif*0.6f;

        System.out.printf("Total: %.2f",total);


    }
}
