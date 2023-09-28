package session16_lambda.practice;

public class LambdaPractice {

    public static void main(String[] args) {
        IntSum getSum = ((firstNumber, secondNumber) -> firstNumber + secondNumber);
        System.out.println(getSum.sum(4,5));

        IntMultiply getMultiply = ((firstNumber, secondNumber) -> firstNumber * secondNumber);
        System.out.println(getMultiply.multiply(4,5));
    }
}