package Replit;

public class UAGStudentObjects {
    public static void main(String[] args) {

        UAGStudent s1 = new UAGStudent("Muhammed",11);
        UAGStudent s2 = new UAGStudent("Ali",12);
        System.out.println(s1);
        System.out.println(s2);
        UAGStudent.resetID();
        UAGStudent s3 = new UAGStudent("Osman",9);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
