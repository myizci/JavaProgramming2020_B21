package day38_StaticKeyword;

import java.text.DecimalFormat;

public class CircleObject {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.00");
        Circle circle1 = new Circle();
        Circle circle2 = new Circle();

        circle1.setInfo(5);
        circle2.setInfo(8);


        System.out.println(circle1);
        System.out.println(circle2);

        System.out.println(circle1 == circle2);
        System.out.println(circle1.equals(circle2));
    }
}
