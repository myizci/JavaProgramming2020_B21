package day46_JavaRecap.CarTask;

public class CarMax {
    public static void main(String[] args) {

        Mercedes mercedes = new Mercedes("E400", "pearl", 2005, 90000);
        Lexus lexus = new Lexus("GX", "silver", 2018, 50000);
        BMW bmw = new BMW("X7", "black", 2020, 98000);
        Tesla tesla = new Tesla("Cyber Truck", "white", 2020, 150000);

        mercedes.start();
        bmw.autoPark();
        tesla.start();

        bmw.color = "green";

        System.out.println(bmw);


    }
}
