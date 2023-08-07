package session4.practice;

public class TernaryOperator {

    public static void main(String[] args) {
        int x = (int) (Math.random() * 100) + 1;
        int y = (int) (Math.random() * 100) + 1;

        String result = x > y ? "First player won." : "Second player won.";
        System.out.println(result);
    }
}
