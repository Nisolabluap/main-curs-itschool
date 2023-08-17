package session6.homework;

public class FrequencyCounter {

    public static void main(String[] args) {
        String inputString = "hello world";
        StringBuilder stringBuilder = new StringBuilder(inputString);

        int[] charFrequency = new int[256];

        for (int i = 0; i < stringBuilder.length(); i++) {
            char currentChar = stringBuilder.charAt(i);
            charFrequency[currentChar]++;
        }

        for (int i = 0; i < 256; i++) {
            if (charFrequency[i] > 0) {
                char c = (char) i;
                System.out.println("'" + c + "': " + charFrequency[i] + " times");
            }
        }
    }
}