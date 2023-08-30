package session10.homework.multilevel;

public class Car {

    private String make;
    private String model;
    private int year;

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void start() {
        System.out.println("Car has started.");
    }

    public void stop() {
        System.out.println("Car has stopped.");
    }

    public void accelerate() {
        System.out.println("The car is accelerating.");
    }
}