package day47_Abstraction.EmployeeTask;

public class AppleInc {
    public static void main(String[] args) {
        Tester tester = new Tester("ALi",21,'M',"34",50_000);
        tester.work();
        tester.sleep();
        System.out.println(tester);


    }


}
