package session7.practice;

import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args) {
        printUserInfo();
    }

    public static void printUserInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name:");
        String userName = scanner.nextLine(); // Use nextLine() to capture the whole line

        System.out.println("Please enter your age:");
        int age = scanner.nextInt();

        System.out.println("Are you a student? (true/false)");
        boolean isStudent = scanner.nextBoolean();

        // Use printf() to format the output
        System.out.printf("Hello %s, your age is %d, and you are %s", userName, age, isStudent ? "a student." : "not a student.");

        scanner.close();
    }
}