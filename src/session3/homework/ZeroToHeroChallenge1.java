package session3.homework;

import java.util.Scanner;

public class ZeroToHeroChallenge1 {

    public static void main(String[] args) {
        //1. Write a Java program to take two numbers as input and display the result of addition, subtraction, multiplication, division, and modulus.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please select two numbers:");
        int myFirstNumber = scanner.nextInt();
        int mySecondNumber = scanner.nextInt();

        int myAddition = myFirstNumber + mySecondNumber;
        int mySubtraction = myFirstNumber - mySecondNumber;
        int myMultiplication = myFirstNumber * mySecondNumber;
        float myDivision = (float) myFirstNumber / mySecondNumber;
        int myModulus = myFirstNumber % mySecondNumber;

        System.out.println("My addition: " + myAddition);
        System.out.println("My subtraction: " + mySubtraction);
        System.out.println("My multiplication: " + myMultiplication);
        System.out.println("My division: " + myDivision);
        System.out.println("My modulus: " + myModulus);

        scanner.close();
    }
}
