package session5.homework;

import java.util.Scanner;

public class JumpStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exitRequested = false;

        while (!exitRequested) {
            System.out.println("Menu:");
            System.out.println("1. Print \"Hello World\"");
            System.out.println("2. Print your name");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Hello World");
                    break;
                case 2:
                    System.out.print("Enter your name: ");
                    String name = scanner.next();
                    System.out.println("Your name is: " + name);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    exitRequested = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }
        }

        scanner.close();
    }
}