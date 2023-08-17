package session6.homework;

public class DuplicateCharacterRemover {

    public static void main(String[] args) {
        String myString = "balloonnnn aaaand maggiiic";
        StringBuilder stringBuilder = new StringBuilder(myString);

        for (int i = 0; i < stringBuilder.length() - 1; i++) {
            char currentChar = stringBuilder.charAt(i);
            char nextChar = stringBuilder.charAt(i + 1);

            if (currentChar == nextChar) {
                stringBuilder.deleteCharAt(i);
                i--;
            }
        }

        System.out.println(stringBuilder.toString());
    }
}