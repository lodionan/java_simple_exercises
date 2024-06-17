package StaticMethodsAndConstructorsExcercise;

public class Calculator {
    public static void summarizer(double number1, double number2) {
        System.out.printf("\nThe result of summarizing %.2f and %.2f is: ", number1, number2);
        System.out.print(number1 + number2);
    }

    public static void summarizer(double number1, double number2, double number3) {
        System.out.printf("\nThe result of summarizing %.2f, %.2f and, %.2f is: ", number1, number2, number3);
        System.out.print(number1 + number2 + number3 + "\n");
    }

    public static void summarizer(int[] numericArray) {
        int result = 0;
        for (int number : numericArray) {
            result += number;
        }
        System.out.println("The result is: " + result);
    }
}
