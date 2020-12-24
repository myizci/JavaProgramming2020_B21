package day42_Inheritance.AnimalTask;

public class Animal {

    public String breed, color, name, size;
    public char gender;
    public int age;


    public void setInfo(String breed, String color, String name, String size, char gender, int age) {
        this.breed = breed;
        this.color = color;
        this.name = name;
        this.size = size;
        this.gender = gender;
        this.age = age;
    }

    public void eat(String food){
        System.out.println(name + " is eating "+ food);
    }

    public void drink(String drink){
        System.out.println(name + " is drinking "+ drink);
    }

    public void sleep(){
        System.out.println(name + " is sleeping ");
    }

    public String toString() {
        return "Animal{" +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }

}
