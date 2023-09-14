package session15.practice.enums;

public class EnumsPractice {

    public static void main(String[] args) {
        printEnumValues();
        printDayMessage(Day.MONDAY);
    }

    private static void printEnumValues() {
        for (Day day : Day.values()) {
            System.out.println("Day: " + day);
            System.out.println("Is weekday? " + day.isWeekday());
        }
    }


    private static void printDayMessage(Day day) {
        switch (day) {
            case MONDAY -> System.out.println("Start of the week!");
            case TUESDAY -> System.out.println("Second day of the week!");
            case WEDNESDAY -> System.out.println("Middle of the week!");
            case THURSDAY -> System.out.println("Almost there!");
            case FRIDAY -> System.out.println("TGIF! It's Friday!");
            case SATURDAY -> System.out.println("Weekend begins!");
            case SUNDAY -> System.out.println("Chill day, it's Sunday!");
        }
    }
}