package day45_Exceptions;

public class ExceptionHandling {
    public static void main(String[] args) {
        // StringIndexOutOfBondsException

        String str = "Cybertek";

        System.out.println("test");
//        try {
//            System.out.println(str.substring(200, 300));
//            System.out.println("TRY Block");
//        } catch (StringIndexOutOfBoundsException e) { // e is the preferred name, it can be any name
//            // System.out.println("StringIndexOutOfBoundsException has occurred");
//            System.out.println("Catch Block");
//            System.out.println(e.getMessage());
//            // e.printStackTrace();
//        }



        try{
            System.out.println(100/0);
        }catch(RuntimeException e){
            System.out.println("Uncheck exception has occurred "+e.getLocalizedMessage());
        }


//        try {
//            Thread.sleep(5000);
//            System.out.println("Try Block");
//        } catch (InterruptedException e) {
//
//            System.out.println("Catch Block");
   //     }
        System.out.println("test completed");

    }
}
