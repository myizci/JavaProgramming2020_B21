package Office_Hours.Practice_01_13_2021.ZooTask;

public final class Dog extends Animal{
    public Dog(String name,String breed, String size, char gender, int age) {
        super(name, breed, size, gender, age);
    }

    @Override
    public void speak() {
        System.out.println("Dog is barking");
    }

    @Override
    public String toString() {
        return "Dog" + super.toString();
    }
}
