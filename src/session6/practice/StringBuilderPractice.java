package session6.practice;

public class StringBuilderPractice {

    public static void main(String[] args) {
        String myString = "";
        System.out.println(myString.isEmpty());
        System.out.println(myString.isBlank());

        for (int index = 0; index < 9; index++) {
            myString += 'a';
        }
        System.out.println(myString);

        StringBuilder stringBuilder = new StringBuilder();

        for (int index = 0; index < 5; index++) {
            stringBuilder.append('a');
        }
        System.out.println(stringBuilder);
    }
}
