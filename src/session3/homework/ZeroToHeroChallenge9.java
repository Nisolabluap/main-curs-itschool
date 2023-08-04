package session3.homework;

import java.util.Scanner;

public class ZeroToHeroChallenge9 {

    public static void main(String[] args) {
        //9. Write a program that calculates the area of a rectangle. Take the length and breadth as inputs.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please select the length and width of your rectangle:");

        int rectangleLength = scanner.nextInt();
        int rectangleWidth = scanner.nextInt();

        int rectangleArea = rectangleLength * rectangleWidth;

        System.out.println("The area of the rectangle is:\n" + rectangleArea);

        scanner.close();
    }
}