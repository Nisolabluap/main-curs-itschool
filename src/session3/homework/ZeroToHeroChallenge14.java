package session3.homework;

import java.util.Scanner;

public class ZeroToHeroChallenge14 {

    public static void main(String[] args) {
        //14. Create a program that checks if a user entered number is within a specific range (e.g., 1-100). Use relational operators for the checks.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please choose a number:");
        int myNumber = scanner.nextInt();

        if (myNumber <= 1 || myNumber >= 100) {
            System.out.println("My number is not included in the 1 to 100 interval, " + myNumber);
        } else {
            System.out.println("My number is included in the 1 to 100 interval, " + myNumber);
        }

        scanner.close();
    }
}