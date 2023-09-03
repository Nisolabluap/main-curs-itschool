package session11.homework.smarthomemanagementsystem;

class SmartDevice implements Device {
    private String name;
    private boolean isOn;

    public SmartDevice(String name) {
        this.name = name;
        this.isOn = false;
    }

    public void turnOn() {
        isOn = true;
        System.out.println(name + " is now on.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println(name + " is now off.");
    }
}