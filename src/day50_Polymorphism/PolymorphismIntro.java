package day50_Polymorphism;

import day49_Abstraction.RemoteDriverTask.ChromeDriver;
import day49_Abstraction.RemoteDriverTask.CybertekDriver;
import day49_Abstraction.RemoteDriverTask.FireFoxDriver;
import day49_Abstraction.RemoteDriverTask.WebDriver;
import day49_Abstraction.ShapeTask.Circle;
import day49_Abstraction.ShapeTask.Cube;
import day49_Abstraction.ShapeTask.Rectangle;
import day49_Abstraction.ShapeTask.Shape;
import day50_Polymorphism.PhoneTask.IPhone;
import day50_Polymorphism.PhoneTask.Phone;
import day50_Polymorphism.PhoneTask.Samsung;

import java.util.ArrayList;

public class PolymorphismIntro {
    public static void main(String[] args) {

        // IPhone iphone1 =  new IPhone("Iphone XR","small","black",500);
        // Samsung samsung = new Samsung("Galaxy S20","large","white",400);
        Phone phone1 = new Samsung("Galaxy S21", "medium", "gray", 300);
        Phone phone2 = new IPhone("Iphone XR", "small", "black", 500);

        ArrayList<Phone> phones = new ArrayList<>();

        phones.add(new IPhone("iPhone11", "large", "red", 1000));
        phones.add(new Samsung("S22", "Extra Extra Large", "blue", 200));

        // List<Integer> list = new ArrayList<>();  // List is interface

        Shape shape;

        shape = new Circle(3);
        shape = new Rectangle(3, 4);
        shape = new Cube(3);

        System.out.println(shape.area());
        System.out.println(shape.perimeter());

        System.out.println("=====================================");


        String browserName = "chrome";

        WebDriver driver;

        switch (browserName) {

            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FireFoxDriver();
                break;
            case "cybertek":
                driver = new CybertekDriver();
                break;

            default:
                throw new RuntimeException("Invalid browser Name");
        }


    }
}
