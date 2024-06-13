package InheritanceExcercise;

public class GeometricFigure {

    /* Base class for calculating
     ** areas and perimeters of the
     ** given figures
     */

    public double rectangleAreaCalculation(double longitud, double ancho) {
        return longitud * ancho;
    }

    public double circleAreaCalculation(double radio) {
        return Math.PI * (radio * radio);
    }

    public double triangleAreaCalculation(double base, double height) {
        return (base * height) / 2;
    }

    public double rectanglePerimeterCalculation(double longitud, double ancho) {
        return (longitud * 2) + (ancho * 2);
    }

    public double trianglePerimeterCalculation(double base, double leftSide, double rightSide) {
        return base + leftSide + rightSide;
    }

    public double circlePerimeterCalculation(double diameter) {
        return Math.PI * diameter;
    }
}
