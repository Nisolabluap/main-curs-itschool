package session6.homework;

public class StringReplacement {

    public static void main(String[] args) {
        String myString = "The cat sat on the mat.";
        String dog = "dog";

        StringBuilder stringBuilder = new StringBuilder(myString.substring(0, 4) + dog + myString.substring(7).toString());
        System.out.println(stringBuilder);
    }
}