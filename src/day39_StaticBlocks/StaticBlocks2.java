package day39_StaticBlocks;

public class StaticBlocks2 {

    public static void main(String[] args) {
        System.out.println("Main Method");
    }

    static{
        System.out.println("Static Block");
    }
    static{
        System.out.println("Static Block 2");
    }

    static {

        System.out.println("Static Block 3");
    }



}
