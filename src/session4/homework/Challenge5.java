package session4.homework;

public class Challenge5 {

    public static void main(String[] args) {
        //5. Write a Java program to print the numbers from 1 to 10 using a for loop. As a next step, modify your program to print only the even numbers from 1 to 10.
        int myFirstNumber = 1;
        int mySecondNumber = 1;

        while (myFirstNumber <= 10) {
            System.out.println(myFirstNumber);
            myFirstNumber++;
        }
        System.out.println();

        while (mySecondNumber <= 10) {
            if (mySecondNumber % 2 == 0) {
                System.out.println(mySecondNumber);
            }
            mySecondNumber++;
        }
    }
}