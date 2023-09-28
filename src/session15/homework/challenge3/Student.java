package session15.homework.challenge3;

import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private int studentId;
    private String email;

    public Student(String name, int age, int studentId, String email) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name) &&
                Objects.equals(email, student.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, email);
    }

    public static void main(String[] args) {
        Student student1 = new Student("Alice", 20, 12345, "alice@example.com");
        Student student2 = new Student("Alice", 20, 67890, "alice@example.com");
        Student student3 = new Student("Bob", 25, 54321, "bob@example.com");

        System.out.println("student1.equals(student2): " + student1.equals(student2));
        System.out.println("student1.equals(student3): " + student1.equals(student3));

        System.out.println("Hash code of student1: " + student1.hashCode());
        System.out.println("Hash code of student2: " + student2.hashCode());
        System.out.println("Hash code of student3: " + student3.hashCode());

        System.out.println("Hash codes of equal students should be the same: " +
                (student1.hashCode() == student2.hashCode()));
    }
}