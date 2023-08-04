package session3.homework;

public class ZeroToHeroChallenge6 {

    public static void main(String[] args) {
        //6. Write a Java program that takes two numbers from the user and uses relational operators to display whether the first number is greater than, less than, or equal to the second number.
        int x = (int) (Math.random() * 201) - 100, y = (int) (Math.random() * 201) - 100;

        if (x == y) {
            System.out.println("x equals y, " + x + "=" + y);
        }
        if (x > y) {
            System.out.println("x bigger than y, " + x + ">" + y);
        }
        if (x < y) {
            System.out.println("x smaller than y, " + x + "<" + y);
        }
    }
}