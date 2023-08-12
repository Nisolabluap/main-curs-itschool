package session5.homework;

import java.util.Scanner;

public class FibonacciSeriesGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide 'n' for Fibonacci series: ");
        int myN = scanner.nextInt();
        fibonacci(myN);

        scanner.close();
    }

    public static void fibonacci(int input) {
        int firstNumber = 0;
        int secondNumber = 1;
        int thirdNumber;

        System.out.print(firstNumber + " " + secondNumber);

        for (int i = 2; i < input; i++) {
            thirdNumber = firstNumber + secondNumber;
            System.out.print(" " + thirdNumber);
            firstNumber = secondNumber;
            secondNumber = thirdNumber;
        }
    }
}