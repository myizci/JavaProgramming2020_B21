package Replit;

import java.util.Scanner;

public class Method_Plus {
    public static void main(String[] args) {

        plus();



    }
    public static void plus(){
        Scanner scan = new Scanner(System.in);

        System.out.println("enter first number:");

        int first = scan.nextInt();

        System.out.println("enter second number:");

        int second = scan.nextInt();
        System.out.println("result: " + (first+second));



    }
}
