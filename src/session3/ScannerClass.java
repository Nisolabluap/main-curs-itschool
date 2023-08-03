package session3;

public class ScannerClass {

    public static void main(String[] args) {
        System.out.println("Session 3");

        String userName = "Paul Balosin";
        int userAge = 34;

        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Please provide some input:");
        //String userInput = scanner.nextLine();
        //System.out.println("Input is: " + userInput);

        // When no longer used, for optimization
        //scanner.close();

        int y = 2;
        double x = 3 + 6 * --y;
        int d = 2;
        double c = 3 + 6 * ++d;

        System.out.println(x);
        System.out.println(c);
        System.out.println(++y);

        String firstName = "Paul";
        String lastName = "Balosin";
        System.out.println(firstName + " " + lastName);

        firstName += " " + lastName;
        System.out.println(firstName);

        boolean myBoolean = false;
        System.out.println(myBoolean); // false
        myBoolean = !myBoolean;
        System.out.println(myBoolean); // true
    }
}