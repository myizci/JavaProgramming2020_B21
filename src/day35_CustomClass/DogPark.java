package day35_CustomClass;

import java.time.LocalDate;
import java.util.ArrayList;

public class DogPark {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
       // Dog dog4 = new Dog();

        dog1.setInfo("Tima","York","small",
                'F',"Multicolcolor", LocalDate.of(2010,8,1));

        dog1.getInfo();

        dog2.setInfo("Trex","Borg","medium",
                'F',"White", LocalDate.of(2016,11,13));

        dog2.getInfo();

        dog3.setInfo("Zirh","Kangal","Large",
                'M',"Beige", LocalDate.of(2018,1,17));

        dog3.getInfo();

        dog1.eat("Yogurt");
        dog2.drink("Meimei");

        Dog[] dogs = {dog1,dog2,dog3};

        ArrayList<Dog> yorks = new ArrayList<>();
        ArrayList<Dog> kangals = new ArrayList<>();
        ArrayList<Dog> borgs = new ArrayList<>();

        for(Dog eachdog:dogs){

            if(eachdog.breed.equalsIgnoreCase("York")){
                yorks.add(eachdog);
            }else if(eachdog.breed.equalsIgnoreCase("Borg")){
                borgs.add(eachdog);
            } else {
                kangals.add(eachdog);
            }
        }

        System.out.println("borgs = " + borgs.size());
        System.out.println("kangals = " + kangals.size());
        System.out.println("yorks = " + yorks.size());

    }
}
