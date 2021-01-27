package day50_Polymorphism.PhoneTask;

import day42_Inheritance.AnimalTask.Animal;
import day42_Inheritance.AnimalTask.Cat;
import day42_Inheritance.AnimalTask.Dog;
import day47_Abstraction.ShapeTasks.Circle;
import day47_Abstraction.ShapeTasks.Shape;
import day49_Abstraction.RemoteDriverTask.ChromeDriver;
import day49_Abstraction.RemoteDriverTask.WebDriver;

public class ReferenceCasting {
    public static void main(String[] args) {
//implicit casting
        int a = 10;
        double b = a;

        // explicit casting

        double d = 10.9999999999999999;
        int c = (int) d;
        System.out.println(c);
        System.out.println("===============================================");
        // upcasting: smaller reference type to large reference type
        Circle circle = new Circle(3);
        Shape shape = (Shape) circle;

        WebDriver driver = (WebDriver) (new ChromeDriver()); // upcasting, redundant

        // Downcasting

        Animal animal = new Dog("Rex", "kangal", 'M', 2, "white", "Large");

        Dog dog = (Dog) animal;
        dog.bark();

        Animal animal2 = new Cat("Minnos","siyam",'F',1,"yellow","small");

        ((Cat) animal2).meow();




    }
}
