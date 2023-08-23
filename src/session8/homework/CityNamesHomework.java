package session8.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CityNamesHomework {

    public static void main(String[] args) {
        /*5. Create an ArrayList that stores city names. Add at least five city names initially.
         Then, prompt the user to add a city name.
         If the city name is already in the list, display a message saying it's a duplicate; otherwise, add it to the list.*/
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> citiesList = new ArrayList<>();
        citiesList.add("Timisoara");
        citiesList.add("Sibiu");
        citiesList.add("Bucharest");
        citiesList.add("Iasi");
        citiesList.add("Arad");
        Collections.sort(citiesList);

        while (true) {
            System.out.println("Enter a city name (or type 'quit' to exit): ");
            String cityInput = scanner.nextLine();

            if (cityInput.equalsIgnoreCase("quit")) {
                break;
            }
            isUnique(citiesList, cityInput);
        }
        scanner.close();

        for (String city : citiesList) {
            System.out.println(city);
        }
    }

    public static boolean containsIgnoreCase(ArrayList<String> list, String value) {
        for (String listItem : list) {
            if (listItem.equalsIgnoreCase(value)) {
                return true;
            }
        }
        return false;
    }

    public static void isUnique(ArrayList<String> list, String value) {
        if (!containsIgnoreCase(list, value)) {
            list.add(value);
        } else {
            System.out.println("Warning: The entered value '" + value + "' is already in the list.");
        }
    }
}