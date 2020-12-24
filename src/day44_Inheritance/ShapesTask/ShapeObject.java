package day44_Inheritance.ShapesTask;

public class ShapeObject {
    public static void main(String[] args) {

        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(4,5);
        Square square = new Square(3);

        System.out.println(circle.calcArea());
        System.out.println(circle.calcPerimeter());
        System.out.println(rectangle.calcArea());
        System.out.println(rectangle.calcPerimeter());
        System.out.println(square.calcArea());
        System.out.println(square.calcPerimeter());

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);
    }
}
