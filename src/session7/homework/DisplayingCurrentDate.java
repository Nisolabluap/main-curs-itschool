package session7.homework;

import java.time.LocalDate;

public class DisplayingCurrentDate {

    public static void main(String[] args) {
        System.out.println(currentDay());
    }

    public static LocalDate currentDay() {
        LocalDate localDate = LocalDate.now();
        return localDate;
    }
}