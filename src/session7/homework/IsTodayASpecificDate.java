package session7.homework;

import java.time.LocalDate;

public class IsTodayASpecificDate {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalDate specificDate = LocalDate.of(2019, 12, 10);

        if (isTodaySpecificDate(localDate, specificDate)) {
            System.out.println("Today is: " + localDate);
        } else {
            System.out.println("Today is not: " + specificDate);
        }
    }

    public static boolean isTodaySpecificDate(LocalDate localDateTime, LocalDate specificDate) {
        return localDateTime.equals(specificDate);
    }
}