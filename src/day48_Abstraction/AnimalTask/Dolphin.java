package day48_Abstraction.AnimalTask;

public final class Dolphin extends Animal implements Playable,Swimmable{
    public Dolphin(String name, String breed, String size, char gender, int age) {
        super(name, breed, size, gender, age);
    }

    @Override
    public void sleep() {
        System.out.println("Dolphin is sleeping");
    }

    @Override
    public void play() {
        System.out.println("Dolphin is playing");
    }

    @Override
    public void swim() {
        System.out.println("Dolphin is swimming");
    }
}
