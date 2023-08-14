package session6.practice;

import javax.sound.midi.Soundbank;

public class MethodExercises {

    public static void main(String[] args) {
        String myString = "Timisoara";
        System.out.println(getStringLength("Timisoara"));
        System.out.println(getStringCharAt("Timisoara", 3));
        System.out.println(myString.indexOf('T'));
        System.out.println(myString.substring(3,5));
    }

    public static int getStringLength(String input) {
        return input.length();
    }

    public static char getStringCharAt (String input, int index) {
        return input.charAt(index);
    }
}
