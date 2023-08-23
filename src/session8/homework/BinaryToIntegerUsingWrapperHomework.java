package session8.homework;

public class BinaryToIntegerUsingWrapperHomework {

    public static void main(String[] args) {
        /*9.Accept a string representation of a binary number, e.g., "1011".
        Convert this string into an Integer using the Integer wrapper class and the method that parses binary.
        Print out the decimal representation of this number.*/
        String binaryNumber = "1011";
        int convertBinaryNumber = Integer.parseInt(binaryNumber, 2);
        System.out.println("Decimal equivalent of binary number " + binaryNumber + " is " + convertBinaryNumber + ".");
    }
}