package session3.homework;

public class NumericPromotion {

    public static void main(String[] args) {
        //1. Write a program where you perform operations between an integer and a double. Display the result and discuss why it is in that format (due to Numeric Promotion).
        int myInt = 13;
        double myDouble = 15.123;

        double mySum = myInt + myDouble;
        double mySubtraction = myInt - myDouble;
        double myMultiplication = myInt * myDouble;
        double myDivision = (float) myInt / myDouble;
        double myModulus = myInt % myDouble;

        System.out.println("My sum: " + mySum);
        System.out.println("My subtraction: " + mySubtraction);
        System.out.println("My multiplication: " + myMultiplication);
        System.out.println("My division: " + myDivision);
        System.out.println("My modulus: " + myModulus);

        //2. Create a program that takes two byte values, adds them together, and stores the result in a byte variable. Explain why the result is or is not what you'd expect, based on the rules of numeric promotion.
        //Answer: i have assigned those values within the range of a byte, -128 to 127. Because the provided values go outside of the byte range it will truncate 150-256=-106
        byte myFirstByte = 100;
        byte mySecondByte = 50;

        byte myByteSum = (byte) (myFirstByte + mySecondByte);

        System.out.println("Result of byte addition: " + myByteSum);
    }
}