package shapes;

import org.w3c.dom.ls.LSOutput;

public class ShapesTest {
    public static void main(String[] args) {

        Measurable myShape = new Rectangle(6, 8) {
        };
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());

        myShape = new Square(5){
        };
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());


    }
}
