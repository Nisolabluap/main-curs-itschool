package session4.homework;

public class Challenge6 {

    public static void main(String[] args) {
        //6. Write a Java program where you declare an integer variable temperature. Assign a value to it and print "Hot" if the temperature is more than 30, "Warm" if the temperature is between 20 and 30, and "Cold" if it's less than 20.
        int myTemperature = (int) (Math.random() * 81) - 40;
        String celsius = "°C";

        if (myTemperature >= 30) {
            System.out.println("The temperature is hot: " + myTemperature + celsius);
        } else if (myTemperature >= 20) {
            System.out.println("The temperature is warm: " + myTemperature + celsius);
        } else {
            System.out.println("The temperature is cold: " + myTemperature + celsius);
        }
    }
}