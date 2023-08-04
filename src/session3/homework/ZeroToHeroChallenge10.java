package session3.homework;

public class ZeroToHeroChallenge10 {

    public static void main(String[] args) {
        //10. Write a program that reverses the sign of an entered integer using unary minus operator.
        int myNumber = (int) (Math.random() * 201) - 100;

        int myReverseSignNumber = -myNumber;

        System.out.println("After reversing the sign my number is: " + myReverseSignNumber + ", original number is: " + myNumber);
    }
}