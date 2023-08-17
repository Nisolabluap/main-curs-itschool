package session6.homework;

public class PalindromeChecker {

    public static void main(String[] args) {
        System.out.println(checkIfPalindrome("hello") + ".");
        System.out.println(checkIfPalindrome("level") + ".");
    }

    public static boolean checkIfPalindrome(String input) {
        StringBuilder stringBuilder = new StringBuilder(input);
        String reversed = stringBuilder.reverse().toString();

        boolean isPalindrome = input.equals(reversed);

        if (isPalindrome) {
            System.out.print(input + " is an palindrome, result: ");
        } else {
            System.out.print(input + " is not an palindrome, result: ");
        }
        return isPalindrome;
    }
}