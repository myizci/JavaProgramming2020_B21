package day49_Abstraction.ShapeTask;

public final class Square extends Shape{
   private double side;

    public Square(double side) {
        super("Square");
        if(side<=0){
            throw new RuntimeException("Invalid length");
        }
       setSide(side);
    }

    @Override
    public double area() {
        return Math.pow(side,2);
    }

    @Override
    public double perimeter() {
        return 4*side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
