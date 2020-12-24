package day44_Inheritance.ShapesTask;

public class Square extends Shape{

    private double side;

    public Square(double side) {
       super("Square");
        this.side = side;

    }

    @Override
    public double calcArea(){
        return side*side;
    }

    public double calcPerimeter(){
        return 4*side;
    }
}
