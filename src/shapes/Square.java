package shapes;

public class Square extends Rectangle {
    private int side;

    public Square(int side) {
        super(side, side);
        this.side = side;

    }


    @Override
    public int getArea() {
        return side * 2;
    }

    @Override
    public int getPerimeter() {
        return side * 4;
    }
}
