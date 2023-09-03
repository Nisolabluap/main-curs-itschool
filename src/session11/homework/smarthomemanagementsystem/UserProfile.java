package session11.homework.smarthomemanagementsystem;

import java.util.List;

interface UserProfile {
    void addDevice(DeviceType type, Device device);

    List<Device> getDevices(DeviceType type);
}