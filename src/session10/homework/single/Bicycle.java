package session10.homework.single;

public class Bicycle {

    private int speed;
    private int gear;

    public int getSpeed() {
        return speed;
    }

    public int getGear() {
        return gear;
    }

    public void changeGear(int newGear) {
        this.gear = newGear;
    }

    public void speedUp(int increment) {
        this.speed += increment;
    }

    public void applyBrake(int decrement) {
        this.speed -= decrement;
    }
}