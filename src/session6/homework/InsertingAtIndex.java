package session6.homework;

public class InsertingAtIndex {

    public static void main(String[] args) {
        String firstString = "I love to code java.";
        StringBuilder stringBuilder = new StringBuilder(firstString);
        int length = firstString.length();
        System.out.println("String length: " + length);

        for (int i = 0; i < stringBuilder.length(); i++)
            if (i == 10) {
                stringBuilder.insert(i, "Paul Balosin ");
            }
        System.out.println(stringBuilder);
    }
}