package calculator;

public class Test {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        try {
            float answer = calculator.reminder(5, 0);
            System.out.println("Answer = " + answer);
        } catch (Exception error) {
            System.out.println("Invalid values, " + error.getMessage());
        }
    }
}
