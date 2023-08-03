package session3;

public class ArithmeticOperations {

    public static void main(String[] args) {
        int firstNumber = 10;
        int secondNumber = 3;

        int sum = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;
        int product = firstNumber * secondNumber;
        float quotient = (float) firstNumber / secondNumber;
        int remainder = firstNumber % secondNumber;

        // ctrl + d - duplicate
        // ctrl + y - delete

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
    }
}