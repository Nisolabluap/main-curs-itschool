package session8.homework;

public class CountEvenAndOddHomework {

    public static void main(String[] args) {
        //4. Given an array of 10 integers, count how many of them are even numbers and how many are odd. Print out both counts.
        int[] myNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, 13, 13, 13, 0, 0};
        countEvenAndOddNumbers(myNumbers);
    }

    public static void countEvenAndOddNumbers(int[] myArrayNumbersInput) {
        int countEven = 0;
        int countOdd = 0;

        for (int number : myArrayNumbersInput) {
            if (number % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        System.out.println("I my array there are " + countEven + " even numbers and " + countOdd + " odd numbers.");
    }
}