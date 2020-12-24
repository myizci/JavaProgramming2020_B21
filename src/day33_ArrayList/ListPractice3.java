package day33_ArrayList;

import java.util.ArrayList;

public class ListPractice3 {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Bayram"); //0
        students.add("Ali"); //1
        students.add("Alpaslan");  //2
        students.add("Naci"); //3
        students.add("Ali"); //4
        students.add("Tahir"); //5
        students.add("Fatih"); //6
        students.add("Akif"); //7
        students.add("Umit"); //8
        students.add("Harun"); //9
        students.add("Ali");
        students.add("Ali");

        System.out.println(students);

        students.remove(1);
        System.out.println(students);
        students.remove("Ali");
        System.out.println(students);
        students.remove(students.size()-1);
        System.out.println(students);

        students.clear();
        System.out.println(students);


    }


}
