package session4.homework;

public class Challenge1 {

    public static void main(String[] args) {
        //1. Write a Java program where you create two String objects named stringOne and stringTwo with the same value "OpenAI". Check and print whether they refer to the same object.
        String stringOne = "OpenAI";
        String stringTwo = "OpenAI";

        System.out.println(stringOne == stringTwo);
        System.out.println(stringOne.equals(stringTwo));
    }
}