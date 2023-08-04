package session3.homework;

public class ZeroToHeroChallenge4 {

    public static void main(String[] args) {
        //4. Write a Java program that uses both the increment (++) and decrement (--) operators in a loop to count up to 10 and then back down to 1.
        int myNumber = 1;

        while (myNumber < 10) {
            System.out.println(myNumber);
            myNumber++;
        }

        int myReset = myNumber;

        while (myNumber >= 1) {
            System.out.println(myNumber);
            myNumber--;
        }
    }
}