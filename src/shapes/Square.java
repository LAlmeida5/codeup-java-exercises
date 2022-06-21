package shapes;

public abstract class Square extends Quadrilateral {

    protected int side;

    public Square(int side) {
        super(side, side);
        this.side = side;
        this.length = side;
        this.width = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public void setLength(int side){
        setSide(side);
    }

    public void setWidth(int side) {
        setSide(side);
    }

    public double getPerimeter() {
        return side * 4;
    }

    public double getArea() {
        return side * side;
    }

    //    protected int side;
//
//    public Square(int side) {
//        super(side, side);
//        this.side = side;
//
//    }
//
//    @Override
//    public int getArea() {
//        System.out.println("Area of the square");
//        return side * side;
//    }
//
//    @Override
//    public int getPerimeter() {
//        System.out.println("Perimeter of the square");
//        return side * 4;
//    }
}
