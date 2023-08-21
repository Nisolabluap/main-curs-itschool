package session7.homework;

import java.time.LocalDate;

public class DateDecomposition {

    public static void main(String[] args) {
        displayDateComponents(1991,12,19);
    }

    public static void displayDateComponents(int year, int month, int day) {
        LocalDate localDate = LocalDate.of(year, month, day);
        System.out.println("Year: " + localDate.getYear());
        System.out.println("Month: " + localDate.getMonthValue());
        System.out.println("Day: " + localDate.getDayOfMonth());
    }
}