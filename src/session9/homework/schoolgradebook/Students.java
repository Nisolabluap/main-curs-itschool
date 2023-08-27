package session9.homework.schoolgradebook;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Students {
    private String studentFullName;
    private String studentClass;
    private UUID studentID = UUID.randomUUID();
    private List<Integer> studentGrades = new ArrayList<>();
    private int averageGrade;

    public String getStudentFullName() {
        return studentFullName;
    }

    public Students setStudentFullName(String studentFullName) {
        this.studentFullName = studentFullName;
        return this;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public Students setStudentClass(String studentClass) {
        this.studentClass = studentClass;
        return this;
    }

    public Students addGrade(int grade) {
        studentGrades.add(grade);
        return this;
    }

    public List<Integer> getStudentGrades() {
        return studentGrades;
    }

    public double averageGrade() {
        if (studentGrades.isEmpty()) {
            return 0.0;
        }

        int sum = 0;

        for (int grade : studentGrades) {
            sum += grade;
        }

        return (double) sum / studentGrades.size();
    }

    @Override
    public String toString() {
        return "Student Name: " + studentFullName +
                "\nStudent ID: " + studentID +
                "\nStudent Class: " + studentClass +
                "\nGrades: " + studentGrades +
                "\nAverage Grade: " + averageGrade();
    }
}
