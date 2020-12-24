package Practice.GroupWork;

public class StudentInfo {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();

        student1.setInfo("Alex",29,
                'M',1234);


        student2.setInfo("Omer",34,
                'M',1235);

        student3.setInfo("Gulistan",21,
                'F',1236);

        student4.setInfo("Natalie",27,
                'F',1237);

        student1.getInfo();
        student2.getInfo();
        student3.getInfo();
        student4.getInfo();
    }
}
