package session16_lambda.practice;

@FunctionalInterface
public interface ConditionalPrinter {

    void print(String input, boolean condition);
}