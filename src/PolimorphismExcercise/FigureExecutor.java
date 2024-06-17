package PolimorphismExcercise;

public class FigureExecutor {
    public static void main(String[] args) {
        Circle circle = new Circle(3.5, 7.0);
        System.out.printf("\nThis circle area is: %f", circle.calculateArea());
        System.out.printf("\nThis circle perimeter is: %f\n", circle.calculatePerimeter());

        Rectangle r = new Rectangle(30, 20);
        System.out.printf("\nThis rectangle Area is: %f", r.calculateArea());
        System.out.printf("\nThis rectangle Perimeter is: %f\n", r.calculatePerimeter());

        Triangle t = new Triangle(25, 30, 25, 25);
        System.out.printf("\nThis Triangle Area is : %f", t.calculateArea());
        System.out.printf("\nThis Triangle Perimeter is : %f\n", t.calculatePerimeter());
    }
}
