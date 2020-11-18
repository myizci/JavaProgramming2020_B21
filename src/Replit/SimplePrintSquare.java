package Replit;

public class SimplePrintSquare {

    public static void printHollowRect() {
        for (int i = 0; i < 5; i++) {
            if (i == 0 || i == 4) {

                for (int j = 0; j < 5; j++) {

                    System.out.print("*");
                }
                System.out.println();
            } else {

                System.out.print("*");
                for (int k = 0; k < 3; k++) {

                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }


        }
    }


    public static void main(String[] args) {
        printHollowRect();
    }
}