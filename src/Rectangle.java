public class Rectangle {

    /* Practice: Simple Class creation.
     ** a rectangle that has as attributes
     ** length and width it also returns
     ** The area and perimeter
     */

    private final int length;
    private final int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void printRectangle() {
        for(int i = 0; i < width; i++) {
            System.out.println();
            for(int j = 0; j < length; j++) {
                System.out.print("* ");
            }
        }
        System.out.println();
    }

    public int calculateArea() {
        return length * width;
    }

    public int calculatePerimeter() {
        return (length * 2) + (width * 2);
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(30, 15);

        r.printRectangle();
        System.out.println("\nThe Rectangle area is: " + r.calculateArea());
        System.out.println("The Rectangle perimeter is: " + r.calculatePerimeter());
    }
}