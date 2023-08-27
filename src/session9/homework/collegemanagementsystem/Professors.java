package session9.homework.collegemanagementsystem;

public class Professors {

    private String firstName;
    private String lastName;
    private char sex;
    private int age;
    private String dateOfBirth;
    private String CNP;
    private String address;
    private static final char delimiter = '\n';
    private Courses course;

    public Courses getCourse() {
        return course;
    }

    public Professors setCourse(Courses course) {
        this.course = course;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Professors setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Professors setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public char getSex() {
        return sex;
    }

    public Professors setSex(char sex) {
        this.sex = sex;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Professors setAge(int age) {
        this.age = age;
        return this;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public Professors setDateOfBirt(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public String getCNP() {
        return CNP;
    }

    public Professors setCNP(String CNP) {
        this.CNP = CNP;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Professors setAddress(String address) {
        this.address = address;
        return this;
    }

    @Override
    public String toString() {
        return "First name: " + firstName + delimiter +
                "Last name: " + lastName + delimiter +
                "Gender: " + sex + delimiter +
                "Age: " + age + delimiter +
                "Date of birth: " + dateOfBirth + delimiter +
                "CNP:  " + CNP + delimiter +
                "Address: " + address + delimiter;
    }
}