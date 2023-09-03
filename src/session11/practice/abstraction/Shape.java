package session11.practice.abstraction;

public abstract class Shape {

    private String name;

    abstract double area();

    abstract double perimeter();

    String getShapeName() {
        return name;
    }
}

class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    String getShapeName() {
        return "Circle";
    }
}

class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }

    @Override
    double perimeter() {
        return 2 * (width + height);
    }

    @Override
    String getShapeName() {
        return "Rectangle";
    }
}