package session4.homework;

public class Challenge4 {

    public static void main(String[] args) {
        //4. Write a Java program where you declare two integer variables heightOne and heightTwo with any values. Use a ternary operator to determine the greater height and assign it to a variable maximumHeight. Print the result.
        int heightOne = (int) (Math.random() * 180) + 1;
        int heightTwo = (int) (Math.random() * 180) + 1;

        int maximumHeight = heightOne > heightTwo ? heightOne : heightTwo;
        System.out.println("Maximum height is: " + maximumHeight + ". Compared heights are: " + heightOne + " and " + heightTwo);
    }
}