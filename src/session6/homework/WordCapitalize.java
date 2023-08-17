package session6.homework;

public class WordCapitalize {

    public static void main(String[] args) {
        String myString = "i like to learn java.";
        System.out.println(myString);
        System.out.println(capitalize(myString));
    }

    public static String capitalize(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        boolean capitalizeNext = true;

        for (char c : input.toCharArray()) {
            if (Character.isWhitespace(c)) {
                capitalizeNext = true;
            } else if (capitalizeNext) {
                c = Character.toUpperCase(c);
                capitalizeNext = false;
            }
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }
}