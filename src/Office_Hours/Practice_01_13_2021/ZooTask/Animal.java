package Office_Hours.Practice_01_13_2021.ZooTask;

public abstract class Animal {
    public String name, size;
    public final String breed;
    public final char gender;
    public int age;
    public static boolean isAnimal;

            static{
        isAnimal=true;
            }

    public Animal(String name, String breed, String size, char gender, int age) {
        this.name = name;
        this.breed = breed;
        this.size = size;
        this.gender = gender;
        this.age = age;
    }

    public abstract void speak();

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
