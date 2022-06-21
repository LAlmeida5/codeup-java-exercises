package shapes;

public abstract class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return (length * 2) + (width * 2);
    }

    @Override
    public double getArea() {
        return length * width;
    }
    //    protected int length;
//    protected int width;
//
//    public Rectangle() {
//    }
//
//    public Rectangle(int length, int width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public int getPerimeter() {
//        System.out.println("Perimeter of the rectangle");
//        return (length * 2) + (width * 2);
//    }
//
//    public int getArea() {
//        System.out.println("Area of the rectangle");
//        return length * width;
//    }
//
//    public int getLength() {
//        return length;
//    }
//
//    public void setLength(int length) {
//        this.length = length;
//    }
//
//    public int getWidth() {
//        return width;
//    }
//
//    public void setWidth(int width) {
//        this.width = width;
//    }
//
}
