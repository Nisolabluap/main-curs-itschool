package session5.homework;

public class ForLoop {

    public static void main(String[] args) {
        int myN = 10;
        fibonacci(myN);

    }

    public static void fibonacci(int myN) {
        int firstNumber = 0;
        int secondNumber = 1;
        int thirdNumber;

        System.out.print(firstNumber + " " + secondNumber);

        for (int i = 2; i < myN; i++) {
            thirdNumber = firstNumber + secondNumber;
            System.out.print(" " + thirdNumber);
            firstNumber = secondNumber;
            secondNumber = thirdNumber;
        }
    }
}