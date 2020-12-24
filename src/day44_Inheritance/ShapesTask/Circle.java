package day44_Inheritance.ShapesTask;

public class Circle extends Shape {

    private double radius,diameter;
    private final static double pi;

    static {
        pi=3.14;
    }

    public Circle(double radius){
        super("Circle");
        this.radius=radius;
        diameter=2*radius;

    }


    @Override
    public double calcArea(){
        return radius*radius*pi;
    }

    @Override
    public double calcPerimeter() {
        return diameter*pi;
    }
}
