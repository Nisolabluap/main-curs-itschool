package session8.homework;

import java.util.ArrayList;

public class StudentListAndGratuatesHomework {

    public static void main(String[] args) {
        /*3. Create
        - 2 empty ArrayLists: studentList and graduateStudentList
        - populate studentList with 10 students
        - copy values from studentList to graduateStudentList
        - iterate through graduateStudentList and print each graduated student*/

        ArrayList<String> studentList = new ArrayList<>();
        studentList.add("Paul");
        studentList.add("Ana");
        studentList.add("Bianca");
        studentList.add("Adi");
        studentList.add("Ion");
        studentList.add("Alex");
        studentList.add("Alexandra");
        studentList.add("Costel");
        studentList.add("Constantin");
        studentList.add("David");

        ArrayList<String> graduateStudentList = new ArrayList<>(studentList);
        Object[] graduateArray = graduateStudentList.toArray();

        System.out.println("Graduated students:");
        for (int index = 0; index < graduateArray.length; index++) {
            if (index < graduateArray.length - 1) {
                System.out.print(graduateArray[index] + ", ");
            } else {
                System.out.print(graduateArray[index] + ".");
            }
        }
    }
}