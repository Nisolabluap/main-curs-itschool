package session3.homework;

import java.util.Scanner;

public class RelationalOperators {

    public static void main(String[] args) {
        //1. Write a Java program that takes two numbers from the user and uses relational operators to display whether the first number is greater than, less than, or equal to the second number.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please choose a value for x, y:");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (x == y) {
            System.out.println("x is equal to y, " + x + "=" + y);
        }
        if (x > y) {
            System.out.println("x is bigger than y, " + x + ">" + y);
        }
        if (x < y) {
            System.out.println("x is smaller than y, " + x + "<" + y);
        }
        //2. Create a program that checks if a user entered number is within a specific range (e.g., 1-100). Use relational operators for the checks.
        System.out.println("Please choose a value for z:");
        int z = scanner.nextInt();

        if (z <= 1 || z >= 100) {
            System.out.println("Z is not included in the 1 to 100 interval, " + z);
        } else {
            System.out.println("Z is included in the 1 to 100 interval, " + z);
        }

        scanner.close();
    }
}