package day40_Constructor;

public class ConstructorIntro {
 public static int b;

    static{

  b=200;
}
    public ConstructorIntro(int a){
        System.out.println("Contructor with int argument");
        b=200;
        this.a=a;

    }
    int a;

    public static void main(String[] args) {

        System.out.println("Hello");
        int num =  new ConstructorIntro(3).a; //a=3;

        ConstructorIntro obj2 = new ConstructorIntro(55); //a=55;
    }
}
