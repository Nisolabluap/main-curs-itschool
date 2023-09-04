package session12.practice.compiletimepolymorphism;

public class Geometry {

    public double area(double radius) {
        return Math.PI * radius * radius;
    }

    public double area(double base, double height) {
        return 0.5 * base * height;
    }
}