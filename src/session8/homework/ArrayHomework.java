package session8.homework;

import java.util.Scanner;

public class ArrayHomework {

    public static void main(String[] args) {
        //1. Create a shopping list with Array and print the values.
        myShoppingList();
    }

    public static void myShoppingList() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("My shopping list contains:");

        String input = scanner.nextLine();
        String[] myShoppingList = input.split(", ");
        scanner.close();

        for (String item : myShoppingList) {
            System.out.println(item);
        }
    }
}