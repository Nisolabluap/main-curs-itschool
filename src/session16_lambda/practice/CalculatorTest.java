package session16_lambda.practice;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = (a, b, operator) -> {
            return switch (operator) {
                case '+' -> a + b;
                case '-' -> a - b;
                case '*' -> a * b;
                case '/' -> {
                    if (b == 0) {
                        throw new ArithmeticException("Division by zero is not allowed");
                    }
                    yield a / b;
                }
                default -> throw new IllegalArgumentException("Invalid operator: " + operator);
            };
        };
        System.out.println(calculator.calculate(4,3,'*'));
    }
}