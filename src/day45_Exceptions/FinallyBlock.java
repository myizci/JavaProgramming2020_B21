package day45_Exceptions;

public class FinallyBlock {
    public static void main(String[] args) {
        try{
            System.out.println(9/0);
        }catch(RuntimeException e){
            System.out.println("Catch Block");
           // System.exit(0); // It terminates everything
        }finally{

            System.out.println("Closed");
        }



    }
}
