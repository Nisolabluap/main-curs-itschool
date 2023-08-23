package session8.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListHomework {

    public static void main(String[] args) {
        myChristmasList();
    }

    public static void myChristmasList() {
        //2. Create a wishlist for Christmas with ArrayList and print the values.
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> christmasList = new ArrayList<>();

        System.out.println("Enter items for your Christmas wishlist (type 'done' to finish):");
        String input = scanner.nextLine();

        while (!input.equalsIgnoreCase("done")) {
            christmasList.add(input);
            input = scanner.nextLine();
        }

        scanner.close();

        System.out.println("My Christmas wishlist contains:");
        for (String item : christmasList) {
            System.out.println(item);
        }
    }
}