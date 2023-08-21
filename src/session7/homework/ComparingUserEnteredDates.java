package session7.homework;

import java.util.Scanner;

public class ComparingUserEnteredDates {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two dates: (yyyy-MM-dd)");
        String firstDate = scanner.next();
        String secondDate = scanner.next();

        areDatesEqual(firstDate, secondDate);
        scanner.close();
    }

    public static void areDatesEqual(String firstDateStr, String secondDateStr) {

        if (firstDateStr.equals(secondDateStr)) {
            System.out.println("Dates are equal: " + firstDateStr + " and " + secondDateStr);
        } else {
            System.out.println("Dates are not equal: " + firstDateStr + " and " + secondDateStr);
        }
    }
}