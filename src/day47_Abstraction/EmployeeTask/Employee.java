package day47_Abstraction.EmployeeTask;

public abstract class Employee extends Person {
    public Employee(String name, int age, char gender, String jobTitle, String ID, double salary) {
        super(name, age, gender);
        this.jobTitle = jobTitle;
        this.ID = ID;
        this.salary = salary;
    }

    public String jobTitle, ID;
    public double salary;

    abstract void work();
 // public void sleep();


    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
