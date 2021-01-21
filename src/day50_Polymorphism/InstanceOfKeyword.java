package day50_Polymorphism;

import day48_Abstraction.AnimalTask.Animal;
import day48_Abstraction.AnimalTask.Dog;
import day48_Abstraction.AnimalTask.Dolphin;
import day48_Abstraction.AnimalTask.Eagle;

public class InstanceOfKeyword {
    public static void main(String[] args) {


        Animal animal = new Eagle("rex","kangal","humongous",'F',2);

        boolean isDog = animal instanceof Dog;
        boolean isDolphin = animal instanceof Dolphin;
        boolean isAnimal = animal instanceof Animal;
        boolean isEagel = animal instanceof Eagle;

        System.out.println("isDog = "+ isDog);
        System.out.println("isDolphin = "+isDolphin);
        System.out.println("isAnimal = " + isAnimal);
        System.out.println("isEagle = "+ isEagel);


    }
}
