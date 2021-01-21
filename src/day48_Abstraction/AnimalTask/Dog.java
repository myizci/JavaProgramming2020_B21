package day48_Abstraction.AnimalTask;

public final class Dog extends Animal implements Playable{
    public Dog(String name, String breed, String size, char gender, int age) {
        super(name, breed, size, gender, age);
    }

    @Override
    public void sleep() {

    }


    @Override
    public void play() {
        System.out.println("Dog is playing");
    }
}
