package session13.practice.bird;

import java.util.Scanner;

public class FloatSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first floating-point number: ");
        float num1 = scanner.nextFloat();

        System.out.print("Enter the second floating-point number: ");
        float num2 = scanner.nextFloat();

        System.out.print("Enter the third floating-point number: ");
        float num3 = scanner.nextFloat();

        // Check for potential overflow
        if (isFloatSumWithinRange(num1, num2, num3)) {
            float sum = num1 + num2 + num3;
            float average = sum / 3;

            System.out.println("The average is: " + average);
        } else {
            System.out.println("The sum exceeds the maximum value representable by a float.");
        }

        // Close the scanner
        scanner.close();
    }

    public static boolean isFloatSumWithinRange(float num1, float num2, float num3) {
        // Calculate the maximum representable value for a float
        float maxFloatValue = Float.MAX_VALUE;

        // Check if the sum of numbers is within the valid range
        return num1 + num2 + num3 <= maxFloatValue;
    }
}
