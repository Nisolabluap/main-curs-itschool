package session3.homework;

public class IncrementAndDecrementOperators {

    public static void main(String[] args) {
        //1. Write a Java program that uses both the increment (++) and decrement (--) operators in a loop to count up to 10 and then back down to 1.
        int myNumber = 1;

        while (myNumber < 10) {
            System.out.println(myNumber);
            myNumber++;
        }

        int myNewNumber = myNumber;
        while (myNumber >= 1) {
            System.out.println(myNumber);
            myNumber--;
        }
        //2. Create a program that takes an integer as input and then increments and decrements it by 1, displaying the output at each stage.
        //Answer: This task is already completed in this code and also UnaryOperators
    }
}
