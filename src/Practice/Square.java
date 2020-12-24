package Practice;

public class Square {

    public static void main(String[] args) {
        square();
    }

    public static void square() {

        for (int i = 1; i <= 10; i++) {

            if (i == 10 || i == 1) {
                for (int j = 1; j <= 10; j++) {
                    System.out.print("*");
                }
                System.out.println();

            } else {
                System.out.print("*");
                for (int k = 1; k <= 8; k++) { // 3 spaces or 100 spaces
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }

        }
    }
}
