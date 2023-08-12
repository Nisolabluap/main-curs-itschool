package session5.homework;

import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter numbers, enter '-1' to exit:");

        int myNumbers = scanner.nextInt();
        whileLoop(myNumbers);

        scanner.close();
    }

    public static void whileLoop(int myInput) {
        int myTotal = 0;
        Scanner scanner = new Scanner(System.in);

        while (myInput != -1) {
            myTotal += myInput;
            myInput = scanner.nextInt();
        }
        scanner.close();

        System.out.println("Your total is: " + myTotal);
    }
}