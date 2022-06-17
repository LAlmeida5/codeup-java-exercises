package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input in = new Input();
        boolean continueCircles = true;
        while (continueCircles) {
            System.out.println("Let's make a circle friends!");
            Circle circle = new Circle(in.getDouble());
            System.out.println("Let's build a circle with MATH!");
            circle.getCircumference();
            circle.getArea();
            System.out.println("Continue circling?");
            continueCircles = in.yesNo();
        }
    }
}
