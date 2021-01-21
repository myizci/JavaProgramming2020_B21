package day47_Abstraction.CarTasks;

public class CarShop {
    public static void main(String[] args) {

        Toyota toyota = new Toyota("Camry","White", 2018, 17000);
        Mercedes mercedes = new Mercedes("GL","Black",2018,41000);
        Tesla tesla = new Tesla("S","Blue", 2020, 38000);
        BMW bmw = new BMW("i8","Gray", 2021,147500);
        System.out.println("Start Mercedes - ");
        mercedes.start();

        System.out.println("Start Mercedes - ");
        toyota.start();




    }
}
