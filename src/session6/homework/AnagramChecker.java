package session6.homework;

public class AnagramChecker {

    public static void main(String[] args) {
        String firstWord = "listen";
        String secondWord = "silent";

        if (areAnagrams(firstWord, secondWord)) {
            System.out.println("'" + firstWord + "' and '" + secondWord + "' are anagrams.");
        } else {
            System.out.println("'" + firstWord + "' and '" + secondWord + "' are not anagrams.");
        }
    }

    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        StringBuilder sb1 = new StringBuilder(str1);
        StringBuilder sb2 = new StringBuilder(str2);

        for (int i = 0; i < sb1.length(); i++) {
            int index = sb2.indexOf(String.valueOf(sb1.charAt(i)));
            if (index == -1) {
                return false;
            }
            sb2.deleteCharAt(index);
        }

        return sb2.length() == 0;
    }
}