package session4.homework;

public class Challenge7 {

    public static void main(String[] args) {
        //7. Write a Java program that determines the type of a triangle based on its sides. Declare three variables sideOne, sideTwo and sideThree to represent the sides of the triangle. Use the ternary operator to determine and print whether the triangle is "Equilateral", "Isosceles", or "Scalene".
        int sideOne = (int) (Math.random() * 10) + 1;
        int sideTwo = (int) (Math.random() * 10) + 1;
        int sideThree = (int) (Math.random() * 10) + 1;

        String triangleType = (sideOne == sideTwo && sideTwo == sideThree)
                ? "Equilateral"
                : (sideOne == sideTwo || sideTwo == sideThree || sideOne == sideThree)
                ? "Isosceles"
                : "Scalene";
        System.out.println("The triangle is: " + triangleType + "\nSides are: " + sideOne + ", " + sideTwo + ", " + sideThree);
    }
}