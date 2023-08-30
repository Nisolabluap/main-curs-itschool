package session10.homework.hierarchical;

public class SpeedBoat extends Boat {

    protected int maxSpeed;
    protected String engineType;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public void turboBoost(String input) {
        System.out.println("Turbo boost is " + input + ".");
    }

    @Override
    public String toString() {
        return "Length: " + getLength()
                + "\nWeight: " + getWeight()
                + "\nMax speed: " + getMaxSpeed()
                + "\nEngine type: " + getEngineType();
    }
}