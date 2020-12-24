package day44_Inheritance;

 class Q{  // Parent class, super class

    public  void method(){
        System.out.println("Method A");
    }
}



public class FinalKeyWord extends Q{  //  FinalKeyWord is a sub class of Q
    public final static int zValue=300; //



    public void method(){
        System.out.println("Method B");
    }





    public static void main(String[] args) {

       FinalKeyWord f1 = new FinalKeyWord();

       f1.method();


        //System.out.println(zValue);
        //zValue=200;
        // final variables must be initialized , cannot be changed
        // final Methods cannot be overridden but you CAN overload!!!
        // final classes can be subClass but they can never be parent class.
        //
    }
}


class T extends FinalKeyWord{ // T is a sub class of FinalKeyWord, gradchild of Q
    @Override
    public void method() {
        System.out.println("C");;
    }
}