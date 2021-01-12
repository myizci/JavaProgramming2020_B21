package Office_Hours.Practice_01_06_2021;

public class ExceptionHandling_Throws {
    public static void main(String[] args) throws Exception {
        System.out.println("Test 1 started");

       // throw new StringIndexOutOfBoundsException();
        Thread.sleep(100);
        System.out.println("Test 1 ended");
        System.out.println("Test 2 started");
        test2();

    }

    public static void test2() throws CloneNotSupportedException {

        throw new CloneNotSupportedException("You cannot clone me");
    }


}
