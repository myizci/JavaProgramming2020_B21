package day45_Exceptions;

import java.util.Scanner;

public class Throw_Keyword {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scan.nextInt();

        if(age<0||age>150){
            throw new RuntimeException("Invalid age entered "+ age);
        }


        if(age>=21){
            System.out.println("eligible");
        }else{
            System.out.println("not eligible");
        }
        scan.close();




    }
}
