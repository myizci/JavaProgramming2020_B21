package day49_Abstraction.ShapeTask;

public final class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle( double length, double width) {
        super("Rectangle");
        if(length<=0 ||width<=0){
            throw new RuntimeException("Invalid width or length");
        }
        setLength(length);
        setWidth(width);
    }


    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double area() {
        return length*width;
    }

    @Override
    public double perimeter() {
        return 2*(length+width);
    }
}
