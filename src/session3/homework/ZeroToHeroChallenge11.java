package session3.homework;

import java.util.Scanner;

public class ZeroToHeroChallenge11 {

    public static void main(String[] args) {
        //11. Write a Java program that takes two boolean inputs from a user. Apply the logical negation operator (!) to each and print the result.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your two boolean choices (true/false):");
        boolean firstValue = scanner.nextBoolean();
        boolean secondValue = scanner.nextBoolean();

        boolean negatedFirstValue = !firstValue;
        boolean negatedSecondValue = !secondValue;

        System.out.println("You chose:\n" + firstValue + " and " + secondValue + " but the results are " + negatedFirstValue + " and " + negatedSecondValue + " because they were negated");

        scanner.close();
    }
}