package day39_StaticBlocks;
public class Test {

    public static void main(String[] args) {

        System.out.println(StaticBlocks.company);
        System.out.println(StaticBlocks.employee1);
        System.out.println(StaticBlocks.b);
        System.out.println(StaticBlocks.isEmployee);

        StaticBlocks.company = "Bank of America";

        System.out.println(StaticBlocks.company);

        System.out.println("=========================");



    }
}
