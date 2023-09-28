package session16_lambda.practice;

import java.util.function.Function;

public class ExploreFunctionalInterfaces {

    public static void main(String[] args) {
        Function<String, Integer> stringLengthFinder = str -> str.length();
        stringLengthFinder.apply("Hello world!");
    }
}