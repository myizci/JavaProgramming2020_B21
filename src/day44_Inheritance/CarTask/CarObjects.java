package day44_Inheritance.CarTask;

public class CarObjects {

    public static void main(String[] args) {
        Honda h1 = new Honda("civic","red",9000,2019,6);

        h1.start();

       System.out.println(h1);



        Mercedes m1 = new Mercedes("E300","black",5000,2006);

        m1.start();
        System.out.println(m1); // This print from sout only wotks with ToString Method


        Jeep j1 = new Jeep("Grand Cheeroke","silver",3000,2019);

        j1.start();
        System.out.println(j1);

        Tesla t1 = new Tesla("Model 3","red",35000,2020);
        t1.start();
        System.out.println(t1);

    }

}
