package day50_Polymorphism;

import day42_Inheritance.AnimalTask.Animal;
import day42_Inheritance.AnimalTask.Cat;
import day43_Inheritance.CarTask.Car;
import day43_Inheritance.CarTask.Toyota;
import day45_Exceptions.PhoneTask.Phone;
import day45_Exceptions.PhoneTask.Samsung;
import day49_Abstraction.RemoteDriverTask.*;
import day49_Abstraction.ShapeTask.Circle;
import day49_Abstraction.ShapeTask.Cylinder;
import day49_Abstraction.ShapeTask.Shape;

public class DownCasting {
    public static void main(String[] args) {
        Shape shape = new Cylinder(3,5);

        //shape.volume(); //Cannot call volume(), not in Animal

       // ((Cylinder)shape).volume();

        Cylinder cylinder = (Cylinder) shape;

        System.out.println(cylinder.volume());

        System.out.println("=============================");

        Animal animal = new Cat("mm","ff",'f',2,"ff","ff");

      //  ((Dog)animal).bark(); // gives ClassCastException  !!!!!

        Car car = new Toyota("Camry","white",2020,32000,28000);

        //((BMW)car).race();
        // gives ClassCastException  !!!!!

        System.out.println("=============================");

        Phone phone = new Samsung("S20","SOuth Korea",200);



       // ((Iphone)phone).faceTime("ff@ff.com");
        // gives ClassCastException  !!!!!

        System.out.println("=============================");

        WebDriver driver = new ChromeDriver();

        ((TakeScreenShot)driver).takeScreenShot("k");

        ( (JavaScriptExecuter)driver).executeScript("");

        System.out.println("=============================");


        Shape shape2 = new Circle(3);

        //((Cube)shape2).volume();

        System.out.println("=============================");

        ((TakeScreenShot)driver).takeScreenShot("");
        ((JavaScriptExecuter)driver).executeScript("");

        System.out.println("=============================");


        RemoteDriver dr1= new FireFoxDriver();
        JavaScriptExecuter js = new FireFoxDriver();
        TakeScreenShot ts = new FireFoxDriver();

        System.out.println("=============================");

        boolean isChrome = (driver instanceof ChromeDriver);
        //Assert.assertTrue(boolean);

    }
}
