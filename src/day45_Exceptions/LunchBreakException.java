package day45_Exceptions;

public class LunchBreakException extends RuntimeException {
   LunchBreakException(){
       super("It is time for lunch");
   }

    LunchBreakException(String msg){
        super(msg);
    }


}


class Test{

    public static void main(String[] args) {
        throw new LunchBreakException("We need to take lunch");
    }
}