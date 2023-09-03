package session11.homework.smarthomemanagementsystem;

import java.util.*;

class HomeownerProfile implements UserProfile {
    private Map<DeviceType, List<Device>> devices;

    public HomeownerProfile() {
        devices = new HashMap<>();
    }

    public void addDevice(DeviceType type, Device device) {
        devices.computeIfAbsent(type, k -> new ArrayList<>()).add(device);
    }

    public List<Device> getDevices(DeviceType type) {
        return devices.getOrDefault(type, Collections.emptyList());
    }
}