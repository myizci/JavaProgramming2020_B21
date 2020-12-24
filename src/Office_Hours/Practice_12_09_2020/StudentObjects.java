package Office_Hours.Practice_12_09_2020;

public class StudentObjects {

    public static void main(String[] args) {
        CybertekStudents student1 = new CybertekStudents();
        CybertekStudents student2 = new CybertekStudents();


        student1.setInfo("Omer",43,'M');
        student1.schoolName="Harvard";
        System.out.println(student1);

        student2.setInfo("Buket",39,'f');
        System.out.println(student1);

    }

}
