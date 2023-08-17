package session7.practice;

import java.util.Random;

public class RandomPractice {

    public static void main(String[] args) {
        printRandomNumbers(1, 500);
    }

    public static void printRandomNumbers(int startInterval, int endInterval) {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            System.out.println(random.nextInt(startInterval, endInterval));
        }
    }
}
