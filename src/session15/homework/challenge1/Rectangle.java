package session15.homework.challenge1;

import java.util.Objects;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return width == rectangle.width && height == rectangle.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(5, 10);
        Rectangle rectangle2 = new Rectangle(5, 10);
        Rectangle rectangle3 = new Rectangle(8, 12);

        System.out.println("rectangle1.equals(rectangle2): " + rectangle1.equals(rectangle2));
        System.out.println("rectangle1.equals(rectangle3): " + rectangle1.equals(rectangle3));

        System.out.println("Hash code of rectangle1: " + rectangle1.hashCode());
        System.out.println("Hash code of rectangle2: " + rectangle2.hashCode());
        System.out.println("Hash code of rectangle3: " + rectangle3.hashCode());

        System.out.println("Hash codes of equal rectangles should be the same: " +
                (rectangle1.hashCode() == rectangle2.hashCode()));
    }
}