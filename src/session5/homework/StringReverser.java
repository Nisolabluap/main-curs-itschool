package session5.homework;

public class StringReverser {

    public static void main(String[] args) {
        String myString = "Java session 5 homework";
        System.out.println(myString);
        reverser(myString);
    }

    public static void reverser(String myInput) {
        String myStringReverser = new StringBuilder(myInput).reverse().toString();
        System.out.println(myStringReverser);
    }
}