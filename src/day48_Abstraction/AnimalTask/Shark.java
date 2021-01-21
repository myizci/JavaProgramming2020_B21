package day48_Abstraction.AnimalTask;

public final class Shark extends Animal implements Predator, Swimmable{
    public Shark(String name, String breed, String size, char gender, int age) {
        super(name, breed, size, gender, age);
    }

    @Override
    public void sleep() {
        System.out.println("Shark is sleeping");
    }

    @Override
    public void hunt() {
        System.out.println("Shark is hunting");
    }

    @Override
    public void swim() {
        System.out.println("Shark is swimming");
    }
}
