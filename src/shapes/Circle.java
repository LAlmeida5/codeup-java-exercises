package shapes;

import java.util.Scanner;

public class Circle {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double getCircumference() {
        return (Math.pow(3.14, 2)) * this.radius;
    }
}
