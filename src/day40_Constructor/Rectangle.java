package day40_Constructor;

public class Rectangle {

    public double length, width, area, perimeter;
    public static int numberOfSides;

    static{
        numberOfSides = 4;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        area = length*width;
        perimeter = (length+width)*2;
    }


    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + area +
                ", perimeter=" + perimeter +
                ", number of sides=" + numberOfSides +
                '}';
    }
}


class RectangleObjects{

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(3,5);
        Rectangle rectangle2 = new Rectangle(20,10);
        System.out.println(rectangle1);
        System.out.println(rectangle2);
        System.out.println(Rectangle.numberOfSides); // always call the static variable by the class name


    }

}