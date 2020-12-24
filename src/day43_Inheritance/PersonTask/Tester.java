package day43_Inheritance.PersonTask;

public class Tester extends Employee {

    public Tester(String name, int age, char gender,double hourlyRate, String jobTitle, String ID) {
        setInfo(name, age,gender,hourlyRate,jobTitle,ID);
    }

    public void testing(){
        System.out.println(jobTitle+ " "+name + " is testing");
    }
}
