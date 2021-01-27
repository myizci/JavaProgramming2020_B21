package Office_Hours.Practice_01_27_2021;

import day45_Exceptions.PhoneTask.*;
import day49_Abstraction.ShapeTask.Cube;
import day49_Abstraction.ShapeTask.Volume;

public class UpDownCastings {
    public static void main(String[] args) {

        //reference type casting

        Phone phone = new Iphone("12 Pro",1100);
        ( (Iphone)phone).faceTime(45355); // one time casting, not reusable


        Iphone iphone = (Iphone) phone;
        //phone is a parent of iphone, needs explicit casting, permanent casting, reusable
        iphone.faceTime(1234567890);
        iphone.faceTime(12345,67890);


       // Phone phone2 = (Samsung) phone;
        // phone is iphone cannot be casted to Samsung, iphone and samsung has no relation

        System.out.println("=======================================");

        Phone phone2 = new Nokia("N91",120);
        ((Nokia)phone2).breakTheFloor();

        //((Iphone) phone2).faceTime(111111); // ClassCastException


        System.out.println("=======================================");

        Phone phone3 = new HuaWei("xyz","Prc",23);
        ((HuaWei)phone3).spy();

        //((Iphone)phone3).faceTime(1111111);// ClassCastException

        System.out.println("=======================================");

        Phone phone4 = new Samsung("S20","Korea",334);

       // ((HuaWei)phone4).spy();
       // ((Nokia) phone4).breakTheFloor();
       // ((Iphone) phone4).faceTime(111111);

        ((Samsung) phone4).freeze();


        System.out.println("=======================================");


        //Volume s1 = new Circle(3);  //compile error, no relation between circle and volume

        Volume v = new Cube(3); // cube and volume has a relation, upcasting

       //double area = ((Cylinder)v).area();

      //  System.out.println(area);   // No relation between cube and cylinder

        double area2= ((Cube)v).area();
        System.out.println(area2);
        System.out.println(((Cube) v).volume());


    }
}
