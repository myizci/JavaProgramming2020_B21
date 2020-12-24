package day43_Inheritance.CarTask;

public class CarMax {

    public static void main(String[] args) {
        Toyota toyota = new Toyota("4Runner","Brown",2011,102103,12000);


        BMW bmw = new BMW("X7","Black",2019,13000,65000);

        System.out.println(toyota);
        System.out.println(bmw);
        System.out.println(BMW.isExpensive);
        System.out.println(BMW.isLuxury);
        System.out.println(Toyota.isAffordable);
        System.out.println(Toyota.isImmortal);
    }
}
