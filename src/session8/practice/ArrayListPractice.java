package session8.practice;

import java.util.ArrayList;

public class ArrayListPractice {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Eva");

        //names = {Alice, Bob, Charlie, Eva}
        //          0       1   2       3

        System.out.println(names);

        names.add(2, "Frank");

        System.out.println(names);

        //names = {Alice, Bob, Frank, Charlie, Eva}
        //          0     1    2       3       4



        boolean isListEmpty = names.isEmpty();
        System.out.println("Is list empty: " + isListEmpty);

        for (String name : names) {
            System.out.println(name);
        }
    }
}