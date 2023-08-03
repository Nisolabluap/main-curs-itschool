package session3;

public class CelsiusToFahrenheit {
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (celsius * 9 / 5) + 32;
        return fahrenheit;
    }

    public static void main(String[] args) {
        double celsiusValue = 25.0;
        double fahrenheitValue = celsiusToFahrenheit(celsiusValue);

        System.out.println(celsiusValue + " degrees Celsius is equal to " + fahrenheitValue + " degrees Fahrenheit.");
    }
}