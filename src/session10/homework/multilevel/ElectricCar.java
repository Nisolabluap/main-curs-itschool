package session10.homework.multilevel;

public class ElectricCar extends Car {

    private int batteryCapacity;
    private int range;

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public int getRange() {
        return range;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public void charge() {
        System.out.println("Car is charging.");
    }
}