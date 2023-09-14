package session15.practice;

import java.util.HashSet;
import java.util.Set;

public class EqualsANdHashcodePractice {

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();

        emp1.setId(1);
        emp1.setName("Alice");
        emp1.setDepartment("IT");

        emp2.setId(1);
        emp2.setName("Alice");
        emp2.setDepartment("IT");

        System.out.println(emp1.equals(emp2));

        Set<Employee> employeeSet = new HashSet<>();
        employeeSet.add(emp1);
        employeeSet.add(emp2);


        System.out.println("Size: " + employeeSet.size());
        System.out.println("Employee1: " + emp1.hashCode());
        System.out.println("Employee2: " + emp2.hashCode());

        System.out.println("Employee1: " + emp1);
    }
}