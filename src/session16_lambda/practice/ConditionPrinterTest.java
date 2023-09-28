package session16_lambda.practice;

public class ConditionPrinterTest {

    public static void main(String[] args) {
        ConditionalPrinter conditionalPrinter = ((String input, boolean condition) -> {
            if (condition) {
                System.out.println(input);
            }
        });
        conditionalPrinter.print("Hello John", true);
        conditionalPrinter.print("Hello Bob", false);
    }
}
