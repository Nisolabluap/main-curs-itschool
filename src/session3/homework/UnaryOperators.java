package session3.homework;

public class UnaryOperators {

    public static void main(String[] args) {
        //1. Create a Java program where you increment and decrement the same variable. Display the value of the variable after each operation.
        int myNumber = 5;

        int myIncrement = ++myNumber;
        int myDecrement = --myNumber;

        System.out.println("Increment value:\n" + myIncrement + "\nDecrement value:\n" + myDecrement);

        //2. Write a program that reverses the sign of an entered integer using unary minus operator.
        int myReverseSignNumber = -myNumber;

        System.out.println("After reversing the sign my number is:\n" + myReverseSignNumber);
    }
}