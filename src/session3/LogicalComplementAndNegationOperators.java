package session3;

public class LogicalComplementAndNegationOperators {

    public static void main(String[] args) {
        boolean isTrue = true;
        boolean isFalse = false;

        isTrue = !isTrue;
        isFalse = !isFalse;

        System.out.println("isTrue is " + isTrue);
        System.out.println("isFalse is " + isFalse);
    }
}