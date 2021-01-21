package day47_Abstraction.EmployeeTask;

public class UberDriver extends Employee{
    public UberDriver(String name, int age, char gender, String jobTitle, String ID, double salary) {
        super(name, age, gender, jobTitle, ID, salary);
    }

    @Override
    void work() {
        System.out.println("Uber driver is driving");
    }

    @Override
    public void sleep() {
        System.out.println("uber drivers sleep less at night");
    }
}
