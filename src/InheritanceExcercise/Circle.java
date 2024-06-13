package InheritanceExcercise;

public class Circle extends GeometricFigure {

    /* This class represents a circle,
     ** the circle returns the
     ** area and perimeter calculated
     */

    private final double diameter;
    private final double radio;

    public Circle(double diameter, double radio) {
        this.diameter = diameter;
        this.radio = radio;
    }

    public static void main(String[] args) {
        Circle c = new Circle(3.3, 1.15);
        System.out.println("\nCircle perimeter is: " + c.circlePerimeterCalculation(c.diameter));
        System.out.println("Circle area is: " + c.circleAreaCalculation(c.radio));
    }

}
