package InheritanceExcercise;

public class Rectangle extends GeometricFigure {

    /* This class represents a rectangle,
     ** the rectangle returns the
     ** area and perimeter calculated
     */

    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(30, 15);
        System.out.println("\nRectangle perimeter is: " + r.rectanglePerimeterCalculation(r.length, r.width));
        System.out.println("Rectangle area is: " + r.rectangleAreaCalculation(r.length, r.width));
    }
}
