package InheritanceExcercise;

public class Triangle extends GeometricFigure {

    /* This class represents a triangle,
     ** the triangle returns the
     ** area and perimeter calculated
     */

    private final double base;
    private final double height;
    private final double leftSide;
    private final double rightSide;

    public Triangle(double base, double height, double leftSide, double rightSide) {
        this.base = base;
        this.height = height;
        this.leftSide = leftSide;
        this.rightSide = rightSide;
    }

    public static void main(String[] args) {
        Triangle t = new Triangle(30, 25, 27, 27);
        System.out.println("\nTriangle area is: " + t.triangleAreaCalculation(t.base, t.height));
        System.out.println("Triangle area is: " + t.trianglePerimeterCalculation(t.base, t.leftSide, t.rightSide));
    }
}
