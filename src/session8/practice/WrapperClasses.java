package session8.practice;

public class WrapperClasses {

    public static void main(String[] args) {
        int number = 10;
        Integer number2 = Integer.valueOf(number);
        Integer autoboxedNumber = number2;

        System.out.println(autoboxedNumber);

        String randomNumber = "12";
        Integer randomNumberConvert = Integer.parseInt(randomNumber);
        Integer randomNumberValueOf = Integer.valueOf(randomNumber);

        System.out.println(randomNumberConvert);
        System.out.println(randomNumberValueOf);
        System.out.println((randomNumberConvert - randomNumberValueOf));
    }
}