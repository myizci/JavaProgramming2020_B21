package day44_Inheritance.ShapesTask;

public class Shape {
    private String name;

    public final static boolean isShape, hasArea, hasPerimeter;  // final makes these vars constant


    static {
        isShape = true;
        hasArea = true;
        hasPerimeter = true;

    }


    public Shape(String name) {
        this.name = name;
    }


     double calcArea(){//override method has to be more visible that original method
        return 0;       // public > protected> default, original method cannot be private
    }

    public double calcPerimeter(){
        return 0;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "Name='" + name + '\'' +
                ", Area='" + calcArea() + '\'' +
                ", Perimeter='" + calcPerimeter() + '\'' +
                '}';
    }
}
