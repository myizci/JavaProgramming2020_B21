package day49_Abstraction.ShapeTask;

public final class Circle extends Shape {
    public Circle(double radius) {
        super("Circle");
        if (radius <= 0) {
            throw new RuntimeException("radius cannot be negative or zero");
        }
        this.radius = radius;
        this.diameter = 2 * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    private double radius;
    private double diameter;
    private final static double PI = 3.14;

    @Override
    public double area() {
        return radius * radius * PI;
    }

    @Override
    public double perimeter() {
        return diameter * PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "area=" + df.format(area()) +
                "perimeter=" + df.format(perimeter()) +
                '}';
    }
}
