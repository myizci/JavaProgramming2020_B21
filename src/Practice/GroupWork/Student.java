package Practice.GroupWork;

public class Student {
    public String name;
    public int age;
    public char gender;
    public int ID;

    public void setInfo(String studentName, int studentAge, char studentGender, int studentID) {
        name = studentName;
        age = studentAge;
        gender = studentGender;
        ID = studentID;
    }

    public void getInfo() {

        System.out.println("Student name is " + name + ", student age is " +
                age + ", student gender is " + gender + ", student ID is " + ID);

    }

    public void study() {
        System.out.println("Student " + name + " is studying");
    }


    public void sleep() {
        System.out.println("Student " + name + " is sleeping");
    }
}