package PolimorphismExcercise;

public class Triangle implements Figure {

    private final double length;
    private final double height;
    private final double rightSide;
    private final double leftSide;

    public Triangle(double length, double height, double rightSide, double leftSide) {
        this.length = length;
        this.height = height;
        this.rightSide = rightSide;
        this.leftSide = leftSide;
    }

    public double calculateArea() {
        return (length * height) / 2;
    }

    public double calculatePerimeter() {
        return length + rightSide + leftSide;
    }

}
