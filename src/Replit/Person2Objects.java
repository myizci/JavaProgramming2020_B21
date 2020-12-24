package Replit;

public class Person2Objects {

    public static void main(String[] args) {


        Person2 p1 = new Person2("Omer","Toksoz","123456789",12,26,1977);

        System.out.println(p1.getBirthday());
        System.out.println(p1.verifySSN("123456789"));
    }
}
