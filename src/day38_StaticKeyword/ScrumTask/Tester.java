package day38_StaticKeyword.ScrumTask;

public class Tester {

    public String name, jobTitle,ID,companyName;
    public double salary;
    public char gender;


    public void setInfo(String name, String jobTitle, String ID, String companyName, double salary, char gender) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.ID = ID;
        this.companyName = companyName;
        this.salary = salary;
        this.gender = gender;
    }
    public void smokeTesting(){
        System.out.println(name+" is performing smoke testing");
    }
    public void creatingTicket(){
        System.out.println(name+ " is creating ticket");
    }
    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", ID='" + ID + '\'' +
                ", companyName='" + companyName + '\'' +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }
}

