package day35_CustomClass;

public class CarObjects {

    public static void main(String[] args) {



        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

car1.brand= "Toyota"; //it should be forbidden setInfo
car2.brand = "Nissan";
car3.brand = "Ford";

car1.model = "Avalon";
        car2.model = "Maxima";
        car3.model = "F150";

//        System.out.println(car1.brand);
//        System.out.println(car2.brand);
//        System.out.println(car3.brand);
//
//        System.out.println(car1.model);
//        System.out.println(car2.model);
//        System.out.println(car3.model);

        Car car4 = new Car();

       car4.setInfo("Mercedes","C300","red",2012,3500);

//        System.out.println(car4.brand);
//        System.out.println(car4.model);
//        System.out.println(car4.color);
//        System.out.println(car4.year);
//
//        System.out.println(car4.brand+" " + car4.model + " "+ car4.color + " "+ car4.year);
       // car4.getInfo();
    }
}
