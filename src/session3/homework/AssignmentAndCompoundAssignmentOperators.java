package session3.homework;

public class AssignmentAndCompoundAssignmentOperators {

    public static void main(String[] args) {
        //1. Create a Java program that demonstrates the use of each compound assignment operator with integers.
        int myOriginalNumber = (int) (Math.random() * 10) + 1;
        int myFirstRandomNumber = myOriginalNumber;
        int mySecondRandomNumber = (int) (Math.random() * 10) + 1;

        int myAddition = myFirstRandomNumber += mySecondRandomNumber;
        myFirstRandomNumber = myOriginalNumber;
        int mySubtraction = myFirstRandomNumber -= mySecondRandomNumber;
        myFirstRandomNumber = myOriginalNumber;
        int myMultiplication = myFirstRandomNumber *= mySecondRandomNumber;
        myFirstRandomNumber = myOriginalNumber;
        float myDivision = (float) (myFirstRandomNumber /= mySecondRandomNumber);
        myFirstRandomNumber = myOriginalNumber;
        int myModulus = myFirstRandomNumber %= mySecondRandomNumber;
        myFirstRandomNumber = myOriginalNumber;

        System.out.println("My Result of addition is: " + myAddition + " Numbers used: " + myOriginalNumber + " + " + mySecondRandomNumber);
        System.out.println("My Result of subtraction is: " + mySubtraction + " Numbers used: " + myOriginalNumber + " - " + mySecondRandomNumber);
        System.out.println("My Result of multiplication is: " + myMultiplication + " Numbers used: " + myOriginalNumber + " * " + mySecondRandomNumber);
        System.out.println("My Result of division is: " + myDivision + " Numbers used: " + myOriginalNumber + " / " + mySecondRandomNumber);
        System.out.println("My Result of modulus is: " + myModulus + " Numbers used: " + myOriginalNumber + " % " + mySecondRandomNumber);

        //2. Write a program to calculate the price after discount. Take the original price and discount percentage as input. Use compound assignment operator to perform the calculation.
        double myPrice = (double) (Math.random() * 1000) + 100;
        double myDiscount = (double) (Math.random() * 70) + 5;

        double myDiscountedPrice = myPrice - (myPrice * (myDiscount / 100));

        System.out.println("\nMy discounted price is: " + (String.format("%.2f", myDiscountedPrice)) + " RON\n" + "Original price is: " + (String.format("%.2f", myPrice)) + " RON\n" + "Discount: " + (String.format("%.2f", myDiscount)) + " %");
    }
}