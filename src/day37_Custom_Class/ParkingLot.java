package day37_Custom_Class;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class ParkingLot {
    public static void main(String[] args) {

        Car[] cars = {new Car(), new Car(), new Car(), new Car(), new Car()};

        cars[0].setInfo("Nissan","Sunny","Tan", LocalDate.of(1999,01,01),1800,235000);
        cars[1].setInfo("Nis","Altima","Tan", LocalDate.of(2005,03,01),1800,235000);
        cars[2].setInfo("Nissan","Sunny","Tan", LocalDate.of(2010,05,01),1800,235000);
        cars[3].setInfo("San","Z300","Tan", LocalDate.of(2015,8,01),1800,235000);
        cars[4].setInfo("Nissan","Quest","Tan", LocalDate.of(2020,12,01),1800,235000);


        System.out.println("==================================================");

        //Recall cars built before 2017;
        ArrayList<Car> recall1 = new ArrayList<>();
        for(Car each:cars){
            if(each.year<2017){

              recall1.add(each);
            }


        }

        System.out.println(recall1);

        System.out.println("==================================================");

//recall All Nissan Sunny build before 2011
        ArrayList<Car> recall2 = new ArrayList<>();
        for(Car each:cars){

            if(each.brand.equals("Nissan")){

                if(each.model.equals("Sunny")&&each.year<2011){
                    recall2.add(each);
                }
            }
        }

        System.out.println(recall2);

        System.out.println("==================================================");

        ArrayList<Car> myCollection = new ArrayList<>(Arrays.asList(cars));

        myCollection.removeIf(p->!(p.brand.equals("Nissan")&&p.model.equals("Sunny")));
        System.out.println(myCollection);


    }

}
