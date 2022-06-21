package shapes;

public class Square extends Rectangle {
    protected int side;

    public Square(int side) {
        super(side, side);
        this.side = side;

    }

    @Override
    public int getArea() {
        System.out.println("Area of the square");
        return side * side;
    }

    @Override
    public int getPerimeter() {
        System.out.println("Perimeter of the square");
        return side * 4;
    }
}
