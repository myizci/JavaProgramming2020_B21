package day41_Encapsulation;

public class Data {

    public static String publicVariable = "A";
    static protected String protectedVariable = "D";
    private static String privateVariable = "B";
    static String defaultVariable = "C"; // "default" access modifier, works in the same package

     Data(){


    }

    public static void publicMethod(){
        System.out.println("Public Method");
    }

    private static void pirateMethod(){
        System.out.println("Private Method");
    }

    static void defaultMethod(){
        System.out.println("Default Method");
    }
}
