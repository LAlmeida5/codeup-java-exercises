package shapes;

import org.w3c.dom.ls.LSOutput;

public class ShapesTest {
    public static void main(String[] args) {

        Measurable myShape;

        myShape = new Square(5){
        };
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());

        myShape = new Rectangle(4,5) {
        };
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());
//
    }
}
