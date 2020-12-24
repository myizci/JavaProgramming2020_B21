package day35_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarMax {

    public static void main(String[] args) {

        Car car1 =new Car();
        Car car2 =new Car();
        Car car3 =new Car();
        Car car4 =new Car();
        Car car5 =new Car();

        car1.setInfo("Nissan","Maxima",
                "Tan",1999,1800);

       //car1.getInfo();

        car2.setInfo("Toyota","Sienna",
                "Gray",2006,6000);
        car3.setInfo("Toyota","Corolla",
                "Black",2010,16000);
        car4.setInfo("VW","Jetta",
                "Orange",2020,36000);
        car5.setInfo("Acura","RDX",
                "Silver",2021,86000);


       // car2.getInfo();

Car[] cars = {car1,car2,car3,car4,car5};



        ArrayList<Car> carList = new ArrayList<>(Arrays.asList(cars));

carList.removeIf(p->p.price<25000);

for(int i=0; i<carList.size(); i++){
    carList.get(i).getInfo();
}

    }

}
