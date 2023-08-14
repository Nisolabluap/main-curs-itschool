package session6.practice;

public class EqualsStringExamples {

    public static void main(String[] args) {
        String colour1 = "Blue";
        String colour2 = "blue";
        String sentence = "        I like to eat apple pie.      ".trim();


        System.out.println(sentence);
        System.out.println(colour1.equals(colour2));
        System.out.println(colour1.equalsIgnoreCase(colour2));
        System.out.println(getStringStartsWith("blue","bl"));
        System.out.println(getStringEndsWith("blue","e"));
        System.out.println(sentence.contains("ie"));
        System.out.println(sentence.replace("  ",""));
        System.out.println(sentence.trim());
    }

    public static boolean getStringStartsWith(String input, String startsWith) {
        return input.startsWith(startsWith);
    }

    public static boolean getStringEndsWith(String input, String endsWith) {
        return input.endsWith(endsWith);
    }
}
