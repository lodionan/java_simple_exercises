package StaticMethodsAndConstructorsExcercise;

public class CalculatorExcecutor {
    public static void main(String[] args) {
        Calculator.summarizer(7.5, 7.5);
        Calculator.summarizer(5, 5, 5);
        Calculator.summarizer(new int[]{1,2,3,4,5});
    }
}
