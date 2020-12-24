package day44_Inheritance.ShapesTask;

public class Cube extends Shape{

    private double side;

    public Cube(double side) {
        super("Cube");
        this.side = side;

    }
    @Override
    double calcArea() {
        Square square = new Square(side);
        double area = square.calcArea();
        return area*6;
    }

    @Override
    public double calcPerimeter() {
        Square square = new Square(side);
        double perimeter = square.calcPerimeter();
        return perimeter*3;
    }
}
