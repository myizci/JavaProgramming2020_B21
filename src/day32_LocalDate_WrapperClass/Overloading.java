package day32_LocalDate_WrapperClass;

public class Overloading {
    public static void main(String[] args) {
        System.out.println("String");
        int[] arr = {1,2};
        main(arr);
    }

    public static void main(int[] args){
        System.out.println("int");
    }

    public static void main(double[] args){
        System.out.println("double");
    }

    public static void main(char[] args){
        System.out.println("char");
    }
}
