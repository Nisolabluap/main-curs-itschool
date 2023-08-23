package session8.homework;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListHomework {

    public static void main(String[] args) {
        /* 6. Given a LinkedList storing student names, write a program that checks if a particular student name exists in the list.
        If it does, remove that name from the list.*/
        LinkedList<String> myLinkedList = new LinkedList<>();
        myLinkedList.add("Paul");
        myLinkedList.add("Paul");
        myLinkedList.add("Paul");
        myLinkedList.add("Adrian");
        myLinkedList.add("Ion");
        myLinkedList.add("Paul");

        String checkStudent = "Paul";

        removeStudent(myLinkedList, checkStudent);
        for (String student : myLinkedList) {
            System.out.println(student);
        }
    }

    public static void removeStudent(LinkedList<String> removeStudent, String inputStudent) {
        Iterator<String> iterator = removeStudent.iterator();

        while (iterator.hasNext()) {
            String student = iterator.next();
            if (student.equals(inputStudent)) {
                iterator.remove();
            }
        }
    }
}