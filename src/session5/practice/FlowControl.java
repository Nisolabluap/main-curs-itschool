package session5.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FlowControl {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select your number: ");
        int myNumber = scanner.nextInt();

        printNumberWithFor(myNumber);
        List<String> myList = new ArrayList<>();
        myList.add("Timisoara");
        myList.add("Bucuresti");
        myList.add("Cluj");

        printListWithFor(myList);
        System.out.println(myList);

        scanner.close();
    }

    public static void printNumberWithFor(int input) {
        for (int number = 1; number <= input; number++) {
            if (number == input) {
                System.out.println(number);
            } else {
                System.out.print(number + ", ");
            }
        }
    }

    public static void printListWithFor(List<String> list) {
        int listSize = list.size();
        int count = 0;
        for (String listValue : list) {
            count++;
            if (count == listSize) {
                System.out.print(listValue);
            } else {
                System.out.print(listValue + ", ");
            }
        }
    }

    public static void printListWithFora(List<String> list) {

    }
}