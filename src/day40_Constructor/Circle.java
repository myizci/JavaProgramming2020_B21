package day40_Constructor;

public class Circle {

    public double radius,diameter,area,perimeter;

    public static double PI;

    static {

        PI=3.14;
    }


    public Circle(double radius) {
        this.radius = radius;
      diameter = 2*radius;
        area = PI*radius*radius;
        perimeter = 2*radius*PI;
    }
}

class CirleObjects {

    public static void main(String[] args) {
        Circle circle1 = new Circle(5);

        System.out.println(circle1.diameter);
        System.out.println(circle1.area);


        Circle circle2 = new Circle(10);
    }


}