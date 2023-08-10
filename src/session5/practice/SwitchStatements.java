package session5.practice;

import java.util.Scanner;

public class SwitchStatements {

    public static final short SUNDAY = 1;
    public static final short MONDAY = 2;
    public static final short TUESDAY = 3;
    public static final short WEDNESDAY = 4;
    public static final short THURSDAY = 5;
    public static final short FRIDAY = 6;
    public static final short SATURDAY = 7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number (1-7) for the day of the week:");
        short myWeekDay = scanner.nextShort();

        scanner.close();

        switch (myWeekDay) {
            case SUNDAY:
                System.out.println("Sunday");
                break;
            case MONDAY:
                System.out.println("Monday");
                break;
            case TUESDAY:
                System.out.println("Tuesday");
                break;
            case WEDNESDAY:
                System.out.println("Wednesday");
                break;
            case THURSDAY:
                System.out.println("Thursday");
                break;
            case FRIDAY:
                System.out.println("Friday");
                break;
            case SATURDAY:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day.");
        }
    }
}