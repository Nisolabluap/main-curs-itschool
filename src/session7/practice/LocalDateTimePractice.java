package session7.practice;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimePractice {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        printLocalDateTimeDecrement(localDateTime, 5);
        printLocalDateTimeDecrement(localDateTime, 5);

        LocalDateTime start = localDateTime.now();
        LocalDateTime end = localDateTime.now().plusDays(1);
        PrintLocalDateTime(start, end);
        printFormattedLocalDateTime(LocalDateTime.now());
    }

    public static void printLocalDateTimeDecrement(LocalDateTime localDateTime, long decrementHours) {
        System.out.println(localDateTime.minusHours(decrementHours));
    }

    public static void PrintLocalDateTime(LocalDateTime localDateTimeStart, LocalDateTime localDateTimeEnd) {
        Duration duration = Duration.between(localDateTimeStart, localDateTimeEnd);
        long hours = duration.toHours();
        long minutes = duration.toMinutes();
        long seconds = duration.toSeconds();
        System.out.printf("Time difference is %d hours, %d minutes, %d seconds.", hours, minutes, seconds);
        System.out.println();
    }

    public static void printFormattedLocalDateTime(LocalDateTime localDateTime) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy hh:mm:ss");
        String formatDateTime = localDateTime.format(dateTimeFormatter);
        System.out.println(formatDateTime);
    }
}