package session15.homework.challenge2;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private String email;

    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30, "alice@example.com");
        Person person2 = new Person("Alice", 30, "alice@gmail.com");
        Person person3 = new Person("Bob", 25, "bob@example.com");

        System.out.println("person1.equals(person2): " + person1.equals(person2));
        System.out.println("person1.equals(person3): " + person1.equals(person3));

        System.out.println("Hash code of person1: " + person1.hashCode());
        System.out.println("Hash code of person2: " + person2.hashCode());
        System.out.println("Hash code of person3: " + person3.hashCode());

        System.out.println("Hash codes of equal persons should be the same: " +
                (person1.hashCode() == person2.hashCode()));
    }
}