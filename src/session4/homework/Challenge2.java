package session4.homework;

public class Challenge2 {

    public static void main(String[] args) {
        //2.  Write a Java program to declare two integer variables firstNumber and secondNumber with any values. Use an equality operator to compare these two numbers and print the result. Do the same for two String objects firstString and secondString with the same value, but use the equals() method for comparison. Print the result.
        int firstNumber = (int) (Math.random() * 10) + 1;
        int secondNumber = (int) (Math.random() * 10) + 1;

        boolean compareNumbers = (firstNumber == secondNumber);
        System.out.println(compareNumbers + "\nThe numbers are: " + firstNumber + " and " + secondNumber);

        String firstString = "Paul";
        String secondString = "Balosin";

        boolean compareStrings = (firstString.equals(secondString));
        System.out.println(compareStrings + "\nThe strings are: " + firstString + " and " + secondString);
    }
}