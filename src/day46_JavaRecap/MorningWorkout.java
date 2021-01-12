package day46_JavaRecap;

public class MorningWorkout {


    public static void sleep(double seconds) {

        try {
            Thread.sleep((long) (seconds * 1000));
        } catch (InterruptedException e) {

        }
    }

    public static void main(String[] args) {

        for (int i = 1; i <= 30; i++) {
            System.out.println("Push Up" + i);
            sleep(1.5);
        }

        int count =1;

        while(count<31){
            System.out.println("Pull Up" + count++);
            sleep(1.5);
        }





    }




}
