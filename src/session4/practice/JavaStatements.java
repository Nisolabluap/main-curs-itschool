package session4.practice;

public class JavaStatements {

    public static void main(String[] args) {
        int currentYear = 2023;
        int birthday = 1991;
        int age = currentYear - birthday;

        if (age > 18) {
            System.out.println("Eligible to vote. Age is: " + age);
        } else {
            System.out.println("Not eligible to vote. Age is: " + age);
        }

        int number = 0;

        if (number > 0) {
            System.out.println("Number is positive.");
        } else if (number < 0) {
            System.out.println("Number is negative.");
        } else {
            System.out.println("Number is 0.");
        }

        printName();
    }

    public static void printName() {
        String name = "Ioana";
        String city = "Cluj";
        String sex = "f";
        int age = 20;

        if (city.equals("Cluj")) {
            if (sex.equals("f")) {
                if (age == 20) {
                    System.out.println(name);
                }
            }
        }

        if (city.equals("Cluj") && sex.equals("f") && age == 20) {
            System.out.println(name);
        }
    }
}
