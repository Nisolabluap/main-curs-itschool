package session11.homework.challenge3;

public class Main {

    public static void main(String[] args) {
        A studentA = new A(10.00, 8.50, 3.13);
        B studentB = new B(8.00, 5.50, 6.13, 9.25);

        System.out.println("Percentage of marks for Student A: " + studentA.getPercentage() + "%");
        System.out.println("Percentage of marks for Student B: " + studentB.getPercentage() + "%");
    }
}