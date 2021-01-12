package day45_Exceptions;

public class ExceptionsIntro {
    public static void main(String[] args)  {
        int[] array = {1,2,3,4,5};

       // System.out.println(array[100]); // unexpected event ==> unchecked ==> runtime

       //Thread.sleep(2000);

        System.out.println(10/0);

        System.out.println("Test completed");
    }
}
