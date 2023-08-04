package session3.homework;

import java.util.Scanner;

public class BinaryArithmeticOperators {

    public static void main(String[] args) {
        //1. Write a Java program to take two numbers as input and display the result of addition, subtraction, multiplication, division, and modulus.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select your two numbers:");

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        String myNewLine = "\n";

        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        float division = (float) firstNumber / secondNumber;
        int modulus = firstNumber % secondNumber;

        //Question: Is this format ok or should I use a different println for each result for better readability?
        System.out.println("Result for operation are:\n" + "Addition: " + addition + myNewLine + "Subtraction: " + subtraction + myNewLine + "Multiplication: " + multiplication + myNewLine + "Division: " + division + myNewLine + "Modulus: " + modulus + myNewLine);
        /*System.out.println("Result for operations are:");
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
        System.out.println("Modulus: " + modulus);*/

        //2. Write a program that calculates the area of a rectangle. Take the length and breadth as inputs.
        System.out.println("Please select the length and width of your rectangle:");

        int rectangleLength = scanner.nextInt();
        int rectangleWidth = scanner.nextInt();

        int rectangleArea = rectangleLength * rectangleWidth;

        System.out.println("The area of the rectangle is:\n" + rectangleArea);

        scanner.close();
    }
}