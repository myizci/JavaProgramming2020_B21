package day49_Abstraction.ShapeTask;

public final class Cube extends Shape implements Volume {
    private double side;

    public Cube(double side) {
        super("Cube");
        if (side <= 0) {
            throw new RuntimeException("invalid side value");
        }
        setSide(side);
    }


    @Override
    public double area() {
        return 6 * new Square(side).area();
    }

    @Override
    public double perimeter() {
        return 12 * side;
    }

    @Override
    public double volume() {
        return new Square(side).area() * side;
    }


    @Override
    public String toString() {
        return "Cube{" +
                "side=" + side +
                "area=" + area() +
                "perimeter=" + perimeter() +
                "volume=" + volume() +
                '}';
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
