package day42_Inheritance.AnimalTask;

public class Zoo { //Zoo HAS a Tiger

    public static void main(String[] args) {

        Tiger tiger = new Tiger("african","yellow","Tigger","Large",'M',3);

        System.out.println(tiger);
        tiger.eat("antelope");


        Cat cat = new Cat("Minnosh","siyam",'F',1,"gray","small");

        System.out.println(cat);
        cat.eat("ciger");
        cat.drink("milk");
        cat.sleep();
        cat.meow();


        Dog dog = new Dog("Rex","kangal",'M',2,"brown","Large");

        System.out.println(dog);

        dog.eat("bones");
        dog.drink("water");
        dog.sleep();
        dog.bark();

    }
}
