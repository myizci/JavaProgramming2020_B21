package Office_Hours.Practice_01_06_2021;

import java.io.FileNotFoundException;
import java.util.NoSuchElementException;

public class ExceptionHandling_TryCatch {

    public static void main(String[] args) {


        try {

            throw new NoSuchElementException("Element not found");
        } catch (NoSuchElementException e) {
            //e.printStackTrace();
        }

        System.out.println("Test ended");
        try {
            System.out.println("cyberterk".charAt(900));
        } catch (RuntimeException e) {
           // e.printStackTrace();
            System.out.println(e.getMessage());
        }


        System.out.println("Test 2 ended");


        //System.out.println(9/0);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Test 3 ended");


        try {
            throw new FileNotFoundException();
        } catch(FileNotFoundException e){
          e.printStackTrace();
        }


    }

}

