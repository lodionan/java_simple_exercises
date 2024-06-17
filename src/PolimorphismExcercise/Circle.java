package PolimorphismExcercise;

public class Circle implements Figure {

    private final double radius;
    private final double diameter;

    public Circle(double radius, double diameter) {
        this.diameter = diameter;
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * (radius * radius);
    }

    public double calculatePerimeter() {
        return Math.PI * diameter;
    }
}
