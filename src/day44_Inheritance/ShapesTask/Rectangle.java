package day44_Inheritance.ShapesTask;

public class Rectangle extends Shape{
    private double length, width;

    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;

    }

    public double calcArea(){
        return length*width;
    }


    public double calcPerimeter(){
        return 2*(length+width);
    }

}
