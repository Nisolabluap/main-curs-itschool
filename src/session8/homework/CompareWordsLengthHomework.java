package session8.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CompareWordsLengthHomework {

    public static void main(String[] args) {
        /*7. Create an ArrayList containing names of fruits.
        Implement a custom sorting mechanism to arrange them in descending order based on their length.
        If two fruits have the same length, sort them in alphabetical order.*/
        ArrayList<String> myFruits = new ArrayList<>();
        myFruits.add("banana");
        myFruits.add("orange");
        myFruits.add("apple");
        myFruits.add("lemon");

        Collections.sort(myFruits, new Comparator<String>() {
            @Override
            public int compare(String fruit1, String fruit2) {
                int lengthComparison = Integer.compare(fruit2.length(), fruit1.length());
                if (lengthComparison != 0) {
                    return lengthComparison;
                } else {
                    return fruit1.compareToIgnoreCase(fruit2);
                }
            }
        });

        for (String fruit : myFruits) {
            System.out.println(fruit);
        }
    }
}