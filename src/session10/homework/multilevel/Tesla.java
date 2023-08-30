package session10.homework.multilevel;

public class Tesla extends ElectricCar {

    private float autopilotVersion;

    public float getAutopilotVersion() {
        return autopilotVersion;
    }

    public void setAutopilotVersion(float autopilotVersion) {
        this.autopilotVersion = autopilotVersion;
    }

    public void enableAutopilot(String input) {
        System.out.println("Autopilot is " + input);
    }

    @Override
    public String toString() {
        return getMake() + " " +
                getModel() + " " +
                getYear() + ", battery " +
                getBatteryCapacity() + " kWs, range of " +
                getRange() + " km, autopilot version " +
                getAutopilotVersion() + ".\n ";
    }
}