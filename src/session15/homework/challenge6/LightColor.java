package session15.homework.challenge6;

public enum LightColor {
    RED("Stop", 30),
    YELLOW("Caution", 5),
    GREEN("Go", 45);

    private final String description;
    private final int durationSeconds;

    private LightColor(String description, int durationSeconds) {
        this.description = description;
        this.durationSeconds = durationSeconds;
    }

    public String getDescription() {
        return description;
    }

    public int getDurationSeconds() {
        return durationSeconds;
    }

    public static void main(String[] args) {
        LightColor redLight = LightColor.RED;
        LightColor yellowLight = LightColor.YELLOW;
        LightColor greenLight = LightColor.GREEN;
        String duration = " - Duration: ";
        String seconds = " seconds";

        System.out.println("Traffic Light Demo:");
        System.out.println("Red Light: " + redLight.getDescription() + duration + redLight.getDurationSeconds() + seconds);
        System.out.println("Yellow Light: " + yellowLight.getDescription() + duration + yellowLight.getDurationSeconds() + seconds);
        System.out.println("Green Light: " + greenLight.getDescription() + duration + greenLight.getDurationSeconds() + seconds);
    }
}