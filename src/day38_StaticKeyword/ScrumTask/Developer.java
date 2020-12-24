package day38_StaticKeyword.ScrumTask;

public class Developer {
    public String name, jobTitle,ID,companyName;
    public double salary;
    public char gender;
    public static boolean hasCodingSkills = true;


    public void setInfo(String name, String jobTitle, String ID, String companyName, double salary, char gender) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.ID = ID;
        this.companyName = companyName;
        this.salary = salary;
        this.gender = gender;
    }
    public void coding(){
        System.out.println(jobTitle+ " "  + name+ " is coding diligently");
    }
    public void fixingBug(){
        System.out.println(jobTitle+ " "  + name+ " is fixing bugs reluctantly");

    }
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", ID='" + ID + '\'' +
                ", companyName='" + companyName + '\'' +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }
}
