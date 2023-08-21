package session8.practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class ArrayListVsLinkedList {

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        /*for (int index = 0; index < 100000; index++) {
            arrayList.add(String.valueOf(index));
            linkedList.add(String.valueOf(index));
        }*/
        //check if LinkedList is faster for add method
        long startTimerLinkedList = System.currentTimeMillis();
        for (int index = 0; index < 10000; index++) {
            linkedList.add(0, String.valueOf(index));
        }
        long endTimerLinkedList = System.currentTimeMillis();

        long startTimerArrayList = System.currentTimeMillis();
        for (int index = 0; index < 10000; index++) {
            linkedList.add(0, String.valueOf(index));
        }
        long endTimerArrayList = System.currentTimeMillis();


        System.out.println("LinkedList time: " + (endTimerLinkedList - startTimerLinkedList) + " millis");
        System.out.println("ArrayList time: " + (endTimerArrayList - startTimerArrayList) + " millis");
    }
}