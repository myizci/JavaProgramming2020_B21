package day38_StaticKeyword;

public class StudentObjects {

    public static void main(String[] args) {

        CybertekStudent student1 = new CybertekStudent();
        CybertekStudent student2 = new CybertekStudent();

        System.out.println(student1.schoolName);// bad way of calling
        System.out.println(student2.schoolName);// a static variable

        System.out.println(CybertekStudent.schoolName); // always call using class name
        // preferred way is calling by class name

        student1.setInfo("Omer",43,4,'M');
        student2.setInfo("Buket",39,7,'F');
        System.out.println(student1);
        System.out.println(student2);

        student1.getSchoolInfo(); // bad way of calling static method
        CybertekStudent.getSchoolInfo(); // right way of calling static method

    }

}
