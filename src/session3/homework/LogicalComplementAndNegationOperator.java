package session3.homework;

import java.util.Scanner;

public class LogicalComplementAndNegationOperator {

    public static void main(String[] args) {
        //1. Write a program to check if a number is positive or negative using logical complement operator.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide a number to check if positive or negative:");
        int myNumber = scanner.nextInt();

        boolean isPositive = myNumber >= 0;

        if (isPositive) {
            System.out.println("My number is positive:\n" + myNumber);
        } else {
            System.out.println("My number is negative:\n" + myNumber);
        }

        //2. Write a Java program that takes two boolean inputs from a user. Apply the logical negation operator (!) to each and print the result.
        System.out.println("Enter your two boolean choices (true/false):");
        boolean firstValue = scanner.nextBoolean();
        boolean secondValue = scanner.nextBoolean();

        boolean negatedFirstValue = !firstValue;
        boolean negatedSecondValue = !secondValue;

        System.out.println("You chose:\n" + firstValue + " and " + secondValue + " but the results are " + negatedFirstValue + " and " + negatedSecondValue + " because they were negated");

        scanner.close();
    }
}