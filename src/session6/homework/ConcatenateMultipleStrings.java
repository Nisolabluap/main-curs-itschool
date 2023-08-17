package session6.homework;

public class ConcatenateMultipleStrings {

    public static void main(String[] args) {
        System.out.println(concatenateStrings("Hello everyone, ", "my name is ", "Paul."));
    }

    public static String concatenateStrings(String input, String input2, String input3) {
        StringBuilder stringBuilder = new StringBuilder(input + input2 + input3);
        return stringBuilder.toString();
    }
}