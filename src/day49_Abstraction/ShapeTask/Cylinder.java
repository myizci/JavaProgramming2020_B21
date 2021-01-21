package day49_Abstraction.ShapeTask;

public final class Cylinder extends Shape implements Volume {

    public double radius, height;
    public final static double PI=3.14;



    public Cylinder(double radius, double height) {
        super("Cylinder");
       if(radius<=0||height<=0){
           throw new RuntimeException("invalid value");
       }
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area() {

        return 2*radius*PI*(radius+height);

    }

    @Override
    public double perimeter() {
        return new Circle(radius).perimeter()*height;
    }

    @Override
    public double volume() {
        return new Circle(radius).area()*height;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                "area='" + df.format(area()) + '\'' +
                "Volume'" + df.format(volume()) + '\'' +
                '}';
    }
}
