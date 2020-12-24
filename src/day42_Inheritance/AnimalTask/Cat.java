package day42_Inheritance.AnimalTask;

public class Cat extends Animal {

    public Cat(String name, String breed, char gender, int age, String color, String size){
        setInfo(breed, color, name, size, gender, age);
    }

    public void meow(){
        System.out.println(name + " is meowing");
    }

}
