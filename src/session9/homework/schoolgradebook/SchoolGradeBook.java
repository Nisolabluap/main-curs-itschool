package session9.homework.schoolgradebook;

import java.util.ArrayList;
import java.util.List;

public class SchoolGradeBook {

    public static void main(String[] args) {
        List<Students> studentList = new ArrayList<>();

        studentList.add(new Students()
                .setStudentFullName("Paul Balosin")
                .setStudentClass("Math")
                .addGrade(8)
                .addGrade(10)
                .addGrade(9));

        studentList.add(new Students()
                .setStudentFullName("John Snow")
                .setStudentClass("English")
                .addGrade(7)
                .addGrade(8)
                .addGrade(6));

        for (Students student : studentList) {
            System.out.println(student + "\n");
        }
    }
}