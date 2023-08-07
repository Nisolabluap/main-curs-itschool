package session4.homework;

import java.util.ArrayList;

public class Challenge10 {

    public static void main(String[] args) {
        //10. Write a Java program that creates two distinct ArrayList objects, listOne and listTwo. Add some elements to listOne and assign listOne to listTwo. Now modify listOne by adding a new element. Print both lists and observe the output.
        ArrayList<String> listOne = new ArrayList<>();
        ArrayList<String> listTwo = new ArrayList<>();

        listOne.add("Paul");
        listOne.add("Adi");
        listOne.add("Bianca");

        listTwo = listOne;

        listOne.add("Ana");

        System.out.println("List one: " + listOne);
        System.out.println("List two: " + listTwo);
    }
}