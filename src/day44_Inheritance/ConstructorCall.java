package day44_Inheritance;

class A {

    public A(){
        System.out.println("A");
    }
}


class B extends A {

    public B(){
        //Constructor public A(){...} will be called first since B extends A.
        System.out.println("B");
    }
}

public class ConstructorCall extends B {

    public ConstructorCall() {
        //super(); A
        System.out.println("C");
    }

    public static void main(String[] args) {
        //new B(); // same as B b = new B();


        new ConstructorCall();



    }


}
