package session5.homework;

public class CountingNegativeNumbers {

    public static void main(String[] args) {
        int[] myNumbersString = {1, 2, 3, -5, 4, 0, -11};
        checkNegative(myNumbersString);
    }

    public static void checkNegative(int[] myInput) {
        int count = 0;
        for (int myNumbers : myInput) {
            if (myNumbers < 0) {
                count++;
            }
        }
        System.out.println("Number of negative number: " + count);
    }
}