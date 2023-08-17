package session6.homework;

public class ReverseAString {

    public static void main(String[] args) {
        System.out.println(myReverser("hello"));
    }

    public static String myReverser(String input) {
        String StringBuilder = new StringBuilder(input).reverse().toString();
        return StringBuilder;
    }
}