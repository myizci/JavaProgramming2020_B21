package day46_JavaRecap.ShapeTask;

public final class Circle extends Shape {
    private double radius;
    private double diameter;
    public static final double PI = 3.14;


    public Circle(double radius) {
        super("Circle");
       if(radius<=0){
           throw new RuntimeException("radius cannot be zero or negative: "+radius);
       }

        setRadius(radius);
        setDiameter(radius*2);
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }


    @Override
    public double area() {
        return Math.pow(radius,2)*PI;
    }

    @Override
    public double perimeter() {
        return diameter*PI;
    }
}
