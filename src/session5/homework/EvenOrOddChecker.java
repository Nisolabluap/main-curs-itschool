package session5.homework;

import java.util.Scanner;

class EvenOrOddChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please select a number: ");
        int myNumber = scanner.nextInt();
        myInteger(myNumber);

        scanner.close();
    }

    public static void myInteger(int myInput) {
        if (myInput % 2 == 0) {
            System.out.println("Number is even: " + myInput);
        } else {
            System.out.println("Number is odd: " + myInput);
        }
    }
}