package session5.homework;

public class ForEachLoop {

    public static void main(String[] args) {
        int[] myNumbersArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        checkForEvenOrOdd(myNumbersArray);
    }

    public static void checkForEvenOrOdd(int[] myInput) {
        for (int myResults : myInput) {
            if (myResults % 2 == 0) {
                System.out.println("Numbers is even: " + myResults);
            } else {
                System.out.println("Numbers is odd: " + myResults);
            }
        }
    }
}