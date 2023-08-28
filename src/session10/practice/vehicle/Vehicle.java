package session10.practice.vehicle;

public class Vehicle {

    private String brand;
    private int speed;

    public void acceleration() {
        speed += 5;
    }

    public void deceleration() {
        speed -= 5;
    }
}

class Car extends Vehicle {
    @Override
    public void acceleration() {
        super.acceleration();
    }
}

class Bike extends Vehicle {

    @Override
    public void deceleration() {
        super.deceleration();
    }
}