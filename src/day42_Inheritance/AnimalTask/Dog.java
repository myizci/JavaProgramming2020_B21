package day42_Inheritance.AnimalTask;

public class Dog extends Animal {

    public Dog(String name, String breed, char gender, int age, String color, String size  ){
        setInfo(breed, color, name, size, gender, age);
    }

public void bark(){
    System.out.println(name + " is barking");
}


    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}






/*
class Main {
    public static void main(String[] args) {
        new Dog().eat("food");

        new Animal();


    }

}
 */