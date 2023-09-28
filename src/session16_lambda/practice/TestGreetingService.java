package session16_lambda.practice;

public class TestGreetingService {

    public static void main(String[] args) {
        //anonymous class
        GreetingService anonymousGreetingService = new GreetingService() {
            @Override
            public void greet(String message) {
                System.out.println("Hello: " + message);
            }
        };
        anonymousGreetingService.greet("John");

        //lambda
        GreetingService lambdaGreetingService = message -> System.out.println("Hello: " + message);
        lambdaGreetingService.greet("Paul");
    }
}