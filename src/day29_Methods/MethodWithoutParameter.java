package day29_Methods;

public class MethodWithoutParameter {
    public static void main(String[] args) {
MethodsWithoutParameters2.printEvenNumbers1To100();
        MethodsWithoutParameters2.printOddNumbers1To100();
        printHello5Times();
        printHello5Times();
    }

    public static void printHello5Times() {

        for(int i =0; i<5;i++ ){

            System.out.print("Hello"+ " ");
        }
        System.out.println();
    }
}
