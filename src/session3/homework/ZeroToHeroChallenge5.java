package session3.homework;

public class ZeroToHeroChallenge5 {

    public static void main(String[] args) {
        //5. Create a Java program that demonstrates the use of each compound assignment operator with integers.
        int myOriginalNumber = (int) (Math.random() * 100) + 1;
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
    }
}