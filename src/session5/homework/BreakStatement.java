package session5.homework;

import java.util.Scanner;

public class BreakStatement {

    public static void main(String[] args) {
        double average = calculateAverage();
        printAverage(average);
    }

    public static double calculateAverage() {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int count = 0;

        while (true) {
            System.out.print("Enter a number (or '0' to exit): ");
            int myNumber = scanner.nextInt();

            if (myNumber == 0) {
                break;
            } else {
                total += myNumber;
                count++;
            }
        }

        scanner.close();

        if (count == 0) {
            return 0;
        } else {
            return (double) total / count;
        }
    }

    public static void printAverage(double average) {
        if (average == 0) {
            System.out.println("No numbers entered.");
        } else {
            System.out.println("Average is: " + average);
        }
    }
}