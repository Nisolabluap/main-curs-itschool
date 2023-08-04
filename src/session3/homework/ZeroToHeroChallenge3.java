package session3.homework;

public class ZeroToHeroChallenge3 {

    public static void main(String[] args) {
        //3. Write a program to check if a number is positive or negative using logical complement operator.
        int myNumber = (int) (Math.random() * 201) - 100;

        boolean isPositive = myNumber >= 0;

        if (isPositive) {
            System.out.println("The number is positive, " + myNumber);
        } else {
            System.out.println("The number is negative, " + myNumber);
        }
    }
}