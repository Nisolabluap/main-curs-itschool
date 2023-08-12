package session5.homework;

import java.util.Scanner;

public class DoWhileLoop  {

    public static void main(String[] args) {
        int secretNumber = generateRandomNumber();
        playGame(secretNumber);
    }

    public static int generateRandomNumber() {
        return (int) (Math.random() * 100) + 1;
    }

    public static void playGame(int secretNumber) {
        Scanner scanner = new Scanner(System.in);
        int guess;

        do {
            System.out.print("Guess a number between 1 and 100: ");
            guess = scanner.nextInt();

            if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            }
        } while (guess != secretNumber);

        System.out.println("Congratulations! You guessed the correct number: " + secretNumber);
        scanner.close();
    }
}