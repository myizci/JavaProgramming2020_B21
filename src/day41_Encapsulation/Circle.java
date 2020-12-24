package day41_Encapsulation;

public class Circle {
    private double radius, diameter, area, perimeter;

    private final static double PI;
     static{
        PI = Math.PI;
     }

    public Circle(double radius) {
        this.radius = radius;
        diameter = 2*radius;
        area = calculateArea();
        perimeter = calculatePerimeter();
    }

    private double calculateArea(){

         return radius*radius*PI;
     }

     private double calculatePerimeter(){
         return diameter*PI;
     }

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public static double getPI() {
        return PI;
    }


    public void setRadius(double radius) {
        this.radius = radius;
        this.diameter=2*radius;
        area = calculateArea();
        perimeter = calculatePerimeter();
    }
}
