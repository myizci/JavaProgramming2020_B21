package day38_StaticKeyword;

public class Circle {

    public double radius,diameter,area,perimeter;

    public void setInfo(double radius) {
        this.radius = radius;
        diameter = 2*radius;
        area = calculateArea();
        perimeter = calculatePerimeter();
    }

    public double calculateArea(){
        return Math.PI*Math.pow(radius,2);
    }

    public double calculatePerimeter(){
        return diameter*Math.PI;
    }

    public String toString() {
        return "Circle{" +
                "\nradius=" + radius +
                ", \ndiameter=" + diameter +
                ", \narea=" + area +
                ", \nperimeter=" + perimeter +
                '}';
    }

    public boolean equals(Circle circle){
        return this.radius==circle.radius;
    }
}
