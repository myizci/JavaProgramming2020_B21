package day47_Abstraction.EmployeeTask;

public class Tester extends Employee{

    public Tester(String name, int age, char gender,  String ID, double salary) {
        super(name, age, gender, "Tester", ID, salary);
    }


    protected void work() {
        System.out.println("Tester is testing the application");
    }

    @Override
    public void sleep() {
        System.out.println("Tester is sleeping 8 hours");
    }

    public void smokeTesting(){
        System.out.println("Smoke testing");
    }
}
