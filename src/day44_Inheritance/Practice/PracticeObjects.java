package day44_Inheritance.Practice;

public class PracticeObjects {


    public static void main(String[] args) {
        Practice1 p1 = new Practice1();
        System.out.println(p1.getAge()); //0
        System.out.println(p1.getName());//null

        p1.setAge(10);
        p1.setName("Mini");

        System.out.println(p1.getAge()); //0
        System.out.println(p1.getName());//null
    }



}
