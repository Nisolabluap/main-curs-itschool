package session8.practice;

import java.util.Arrays;

public class ArraysPractice {

    public static void main(String[] args) {
        //int[] numbers = new int[5];
        int[] numbers = {11, 6, 4, 10};
        //index          0  1  2  3
        extracted(numbers);

        String[][] names = {{"Ms.", "Mr."}, {"Maria", "John"}};
        printMultidimensionalArray(names);

        printIntSortedArray(numbers);
        printSortedArray(names[1]);

        printIntSearchResult(names[1], "Maria");
        printIntSearchResult(numbers, 11);
    }

    private static void extracted(int[] numbers) {
        int average = 0;

        for (int number : numbers) {
            average += number;
        }

        int result = average / numbers.length;
        System.out.println("Arrays length: " + numbers.length);
        System.out.println("Arrays average: " + result);
    }

    public static void printMultidimensionalArray(String[][] names) {
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                System.out.print(names[j][i] + " ");
            }
            System.out.println();
        }
    }

    public static void printSortedArray(String[] arrayInput) {
        Arrays.sort(arrayInput);
        for (String array : arrayInput) {
            System.out.println(array);
        }
    }

    public static void printIntSortedArray(int[] arrayInput) {
        Arrays.sort(arrayInput);
        for (int array : arrayInput) {
            System.out.println(array);
        }
    }

    public static void printIntSearchResult(String[] arrayInput, String searchKey) {
        Arrays.sort(arrayInput);
        System.out.println(Arrays.binarySearch(arrayInput, searchKey));
    }

    public static void printIntSearchResult(int[] arrayInput, int searchKey) {
        Arrays.sort(arrayInput);
        System.out.println(Arrays.binarySearch(arrayInput, searchKey));
    }
}