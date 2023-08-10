package session5.practice;

public class DoWhileStatements {

    public static void main(String[] args) {
        int myNumber = 3;

        while (myNumber < 5) {
            System.out.println("Iteration: " + ++myNumber);
        }

        int mySecond = 3;
        do {
            System.out.println("Iteration: " + ++mySecond);
        } while (mySecond < 5);

        while (mySecond <= 10) {
            System.out.print(mySecond + ", ");
            mySecond++;
        }
    }
}