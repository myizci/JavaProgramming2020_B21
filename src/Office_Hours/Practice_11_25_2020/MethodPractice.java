package Office_Hours.Practice_11_25_2020;

public class MethodPractice {

    public static void main(String[] args) {
        //divisibleBy3(100,40);
        // divisibleBy3();
        grade(5);

    }

    public static void divisibleBy3() {

        for (int i = 1; i <= 100; i++) {

            if (i % 3 != 0) {
                continue;
            } else {
                System.out.print(i + " ");
            }

        }
        System.out.println();
    }


    public static void divisibleBy3(int a, int b) {

        if (a >= b) {
            System.out.println("Invalid numbers");
            return;
        }

        for (int i = a; i <= b; i++) {

            if (i % 3 == 0) {
                System.out.print(i + " ");
            }

        }
        System.out.println();
    }


    public static void grade(int score) {

        if (score < 0 || score > 100) {
            System.out.println("Invalid score");
            return;
        }

        char grade = (score >= 90) ? 'A' : (score >= 80) ? 'B' : (score >= 70) ? 'C' : (score >= 60) ? 'D' : 'F';

        switch (grade) {

            case 'A':
                System.out.println("Excellent, you made an A");
                break;

            case 'B':
                System.out.println("Great, you made a B");
                break;

            case 'C':
                System.out.println("Good, you made a C");
                break;

            case 'D':
                System.out.println("Passed, you made a D");
                break;

            default:
                System.out.println("Failed, you made an F");


        }
    }
}
