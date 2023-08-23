package session8.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Challenge {

    /*10. Write a program that manages a personal diary using an ArrayList.
    Each entry in the diary is a string that contains a date in the format "YYYY-MM-DD" followed by a colon and the diary entry for that day.
    Your program should allow the user to:
    Add a new entry (but ensure there's no duplicate date).
            Edit an existing entry based on the date.
            Delete an entry by date.
            Display all entries in reverse chronological order (latest first).
    Ensure that all these operations are efficient, especially the addition of new entries,
    which should keep the list sorted without resorting it every time.*/


    static class DiaryEntry {
        String date;
        String entry;

        DiaryEntry(String date, String entry) {
            this.date = date;
            this.entry = entry;
        }
    }

    public static void main(String[] args) {
        ArrayList<DiaryEntry> diaryEntries = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Diary Manager Menu:");
            System.out.println("1. Add Entry");
            System.out.println("2. Edit Entry");
            System.out.println("3. Delete Entry");
            System.out.println("4. Display Entries");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1:
                        addEntry(diaryEntries, scanner);
                        break;
                    case 2:
                        editEntry(diaryEntries, scanner);
                        break;
                    case 3:
                        deleteEntry(diaryEntries, scanner);
                        break;
                    case 4:
                        displayEntries(diaryEntries);
                        break;
                    case 5:
                        System.out.println("Exiting the program.");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
                choice = 0;
            }
        } while (choice != 5);

        scanner.close();
    }

    static void addEntry(ArrayList<DiaryEntry> diaryEntries, Scanner scanner) {
        System.out.print("Enter the date (YYYY-MM-DD): ");
        String date = scanner.nextLine();

        for (DiaryEntry entry : diaryEntries) {
            if (entry.date.equals(date)) {
                System.out.println("An entry for this date already exists.");
                return;
            }
        }

        System.out.print("Enter your diary entry: ");
        String entry = scanner.nextLine();

        DiaryEntry newEntry = new DiaryEntry(date, entry);
        diaryEntries.add(newEntry);
        Collections.sort(diaryEntries, Comparator.comparing((DiaryEntry e) -> e.date).reversed());
    }

    static void editEntry(ArrayList<DiaryEntry> diaryEntries, Scanner scanner) {
        System.out.print("Enter the date (YYYY-MM-DD) of the entry to edit: ");
        String date = scanner.nextLine();

        for (DiaryEntry entry : diaryEntries) {
            if (entry.date.equals(date)) {
                System.out.print("Enter the new diary entry: ");
                String newEntry = scanner.nextLine();
                entry.entry = newEntry;
                System.out.println("Entry updated successfully.");
                return;
            }
        }

        System.out.println("No entry found for the given date.");
    }

    static void deleteEntry(ArrayList<DiaryEntry> diaryEntries, Scanner scanner) {
        System.out.print("Enter the date (YYYY-MM-DD) of the entry to delete: ");
        String date = scanner.nextLine();

        for (int i = 0; i < diaryEntries.size(); i++) {
            if (diaryEntries.get(i).date.equals(date)) {
                diaryEntries.remove(i);
                System.out.println("Entry deleted successfully.");
                return;
            }
        }

        System.out.println("No entry found for the given date.");
    }

    static void displayEntries(ArrayList<DiaryEntry> diaryEntries) {
        System.out.println("Diary Entries (Latest first):");
        for (DiaryEntry entry : diaryEntries) {
            System.out.println(entry.date + ": " + entry.entry);
        }
    }
}