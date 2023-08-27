package session9.homework.collegemanagementsystem;

public class Students {

    private String firstName;
    private String lastName;
    private char sex;
    private int age;
    private String dateOfBirth;
    private String CNP;
    private String address;
    private static final char delimiter = '\n';

    public String getFirstName() {
        return firstName;
    }

    public Students setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Students setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public char getSex() {
        return sex;
    }

    public Students setSex(char sex) {
        this.sex = sex;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Students setAge(int age) {
        this.age = age;
        return this;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public Students setDateOfBirt(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public String getCNP() {
        return CNP;
    }

    public Students setCNP(String CNP) {
        this.CNP = CNP;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Students setAddress(String address) {
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