package session11.homework.smarthomemanagementsystem;

public class Main {
    public static void main(String[] args) {
        Device livingRoomLight = new SmartDevice("Living Room Light");
        Device thermostat = new SmartDevice("Thermostat");
        Device frontDoor = new SmartDevice("Front Door");

        UserProfile homeownerProfile = new HomeownerProfile();
        homeownerProfile.addDevice(DeviceType.LIGHT, livingRoomLight);
        homeownerProfile.addDevice(DeviceType.THERMOSTAT, thermostat);
        homeownerProfile.addDevice(DeviceType.DOOR, frontDoor);

        SmartHomeSystem smartHome = new SmartHomeSystem();
        smartHome.addUserProfile(homeownerProfile);

        smartHome.remoteControl(homeownerProfile, DeviceType.LIGHT, true);
        smartHome.remoteControl(homeownerProfile, DeviceType.THERMOSTAT, false);
    }
}