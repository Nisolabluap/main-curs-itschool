package session11.homework.smarthomemanagementsystem;

import java.util.ArrayList;
import java.util.List;

class SmartHomeSystem {
    private List<UserProfile> userProfiles;

    public SmartHomeSystem() {
        userProfiles = new ArrayList<>();
    }

    public void addUserProfile(UserProfile userProfile) {
        userProfiles.add(userProfile);
    }

    public void remoteControl(UserProfile userProfile, DeviceType type, boolean turnOn) {
        for (UserProfile profile : userProfiles) {
            if (profile == userProfile) {
                List<Device> devices = profile.getDevices(type);
                for (Device device : devices) {
                    if (turnOn) {
                        device.turnOn();
                    } else {
                        device.turnOff();
                    }
                }
            }
        }
    }
}