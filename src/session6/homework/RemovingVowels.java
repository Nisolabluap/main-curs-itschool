package session6.homework;

public class RemovingVowels {

    public static void main(String[] args) {
        String myString = "I love apples.";
        StringBuilder stringBuilder = new StringBuilder(myString
                .toLowerCase()
                .replace("a", "")
                .replace("e", "")
                .replace("i", "")
                .replace("o", "")
                .replace("u", ""));
        System.out.println(stringBuilder);

        System.out.println(removeVowels(myString));
    }

    public static String removeVowels(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        String myVowels = "aeiouAEIOU";

        for (char c : input.toCharArray()) {
            if (!myVowels.contains(String.valueOf(c))) {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }
}