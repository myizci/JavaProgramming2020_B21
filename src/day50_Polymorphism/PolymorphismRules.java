package day50_Polymorphism;

import day42_Inheritance.AnimalTask.Animal;
import day42_Inheritance.AnimalTask.Dog;
import day46_JavaRecap.CarTask.BMW;
import day46_JavaRecap.CarTask.Car;
import day46_JavaRecap.CarTask.Tesla;
import day49_Abstraction.ShapeTask.Cube;
import day49_Abstraction.ShapeTask.Shape;

public class PolymorphismRules {

    public static void main(String[] args) {
       Dog dog  = new Dog("Rex","kangal",'M',2,"yello","large");

       dog.bark();

        Animal animal = new Dog("Rex","kangal",'M',2,"yello","large");

        animal.eat("food");
        //methods come from reference type… implementation comes from object type

      Dog dog2 = (Dog)animal;

        Cube cube = new Cube(5);

        Shape shape = new Cube(5);

        System.out.println(cube.area());
        System.out.println(cube.perimeter());
        System.out.println(cube.volume());

        System.out.println(shape.area());
        System.out.println(shape.perimeter());
        //shape.volume();

        System.out.println("========================");

        Car car =new Tesla("model 3","white",2020,40000 );

        Car car2 = new BMW("M3","black",1999,10000);

        //car.autoPilot();  car does not have auto pilot

        car.start();
        car2.start();

        Animal animal2 = new Dog("Moi","fino",'F',1,"white","mini");





    }
}
