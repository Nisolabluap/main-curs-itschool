package session13.practice.bird;

import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a day of the week (e.g., Monday, Tuesday, ...): ");
        String dayOfWeek = scanner.nextLine().toLowerCase();

        switch (dayOfWeek) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                System.out.println(dayOfWeek + " is a weekday.");
                break;
            case "saturday":
            case "sunday":
                System.out.println(dayOfWeek + " is a weekend day.");
                break;
            default:
                System.out.println("Invalid input. Please enter a valid day of the week.");
        }
        scanner.close();
    }
}