package day43_Inheritance.PersonTask;

public class Employee extends Person {
    public double hourlyRate;
    public String jobTitle,ID;

//    public Employee(String name, int age, char gender,double hourlyRate, String jobTitle, String ID) {
//        setInfo(name, );
//    }

    public void work(){
        System.out.println(name + " is working");
    }

    public void setInfo(String name, int age, char gender,double hourlyRate, String jobTitle, String ID){
        setInfo(name, age, gender);
        this.hourlyRate = hourlyRate;
        this.ID = ID;
        this.jobTitle = jobTitle;
    }

    public double calcSalary(){

        return  40*52*hourlyRate;
    }



    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", hourlyRate=" + hourlyRate +
                ", jobTitle='" + jobTitle + '\'' +
                ", ID='" + ID + '\'' +
                ", Salary='" + (int)calcSalary() + '\'' +
                '}';
    }
    public static String publicVariable = "Public variable";
    protected static String protectedVariable = "Protected variable";
     static String defaultVariable = "Default variable";

}
