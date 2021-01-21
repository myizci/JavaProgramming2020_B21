package day48_Abstraction.AnimalTask;

public final class Parrot extends Animal implements Flyable, Playable {
    public Parrot(String name, String breed, String size, char gender, int age) {
        super(name, breed, size, gender, age);
    }

    @Override
    public void sleep() {
        System.out.println("Parrot is sleeping");
    }

    @Override
    public void fly() {
        System.out.println("Parrot is flying");
    }

    @Override
    public void play() {
        System.out.println("Parrot is playing");
    }
}
