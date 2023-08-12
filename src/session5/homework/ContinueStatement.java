package session5.homework;

import java.util.Scanner;

public class ContinueStatement {

    public static void main(String[] args) {
        int sum = getSumOfNumbersGreaterThanFive();
        printSum(sum);
    }

    public static int getSumOfNumbersGreaterThanFive() {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;

        System.out.println("Enter 10 numbers:");

        while (count < 10) {
            System.out.print("Number " + (count + 1) + ": ");
            int number = scanner.nextInt();

            if (number <= 5) {
                System.out.println("Skipping " + number + " as it's less than or equal to 5.");
                continue;
            }

            sum += number;
            count++;
        }

        scanner.close();
        return sum;
    }

    public static void printSum(int sum) {
        System.out.println("Sum of numbers greater than 5: " + sum);
    }
}