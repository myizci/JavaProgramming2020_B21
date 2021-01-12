package day46_JavaRecap.ShapeTask;

import java.util.ArrayList;

public class Shape {
    public String name;

    Shape(String name){
        ArrayList<Character> nameArray = new ArrayList<>();

        if(name.equals("")){
           throw new RuntimeException("Shape name cannot be empty");
       }

        for (int i = 0; i <name.length() ; i++) {
            char eachChar = name.charAt(i);

            if(!Character.isLetter(eachChar)){
                throw new RuntimeException("Not a valid name");
            }
        }


        this.name = name;
    }


    public double area(){
        return 0;
    }

    public double perimeter(){
        return 0;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                "area='" + area() + '\'' +
                "perimeter='" + perimeter() + '\'' +
                '}';
    }
}
