package session7.homework;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class GettingCurrentTime {

    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        String formattedTime = localTime.format(formatter);
        System.out.println(formattedTime);
    }
}