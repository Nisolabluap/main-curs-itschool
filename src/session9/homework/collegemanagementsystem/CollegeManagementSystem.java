package session9.homework.collegemanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class CollegeManagementSystem {

    public static void main(String[] args) {
        List<Students> studentsList = new ArrayList<>();

        studentsList.add(new Students()
                .setFirstName("Paul")
                .setLastName("Balosin")
                .setSex('M')
                .setAge(31)
                .setDateOfBirt("1991-12-19")
                .setCNP("1234")
                .setAddress("Str. Random 33"));

        studentsList.add(new Students()
                .setFirstName("Luap")
                .setLastName("Balosin")
                .setSex('M')
                .setAge(31)
                .setDateOfBirt("1991-06-19")
                .setCNP("1345")
                .setAddress("Str. Random 1"));

        List<Professors> professorsList = new ArrayList<>();

        Professors mathProfessor = new Professors()
                .setFirstName("John")
                .setLastName("Travolta")
                .setSex('M')
                .setAge(31)
                .setDateOfBirt("1991-12-19")
                .setCNP("1234")
                .setAddress("Str. Random 33")
                .setCourse(Courses.MATH);

        professorsList.add(mathProfessor);

        Professors englishProfessor = new Professors()
                .setFirstName("Alice")
                .setLastName("Wonderland")
                .setSex('M')
                .setAge(31)
                .setDateOfBirt("1991-06-19")
                .setCNP("1345")
                .setAddress("Str. Random 1")
                .setCourse(Courses.ENGLISH);

        professorsList.add(englishProfessor);

        for (Students student : studentsList) {
            System.out.println("Student: " + student.getFirstName() + " " + student.getLastName());
            System.out.println();
        }

        for (Professors professor : professorsList) {
            System.out.println("Professor: " + professor.getFirstName() + " " + professor.getLastName());
            System.out.println("Assigned Course: " + professor.getCourse().getCourseName());
            System.out.println("Schedule: " + professor.getCourse().getSchedule());
            System.out.println();
        }

        for (Courses course : Courses.values()) {
            course.printCourses();
        }
    }
}