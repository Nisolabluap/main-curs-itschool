package session10.homework.single;

public class MountainBike extends Bicycle {

    private String tireType;
    private String suspension;

    public String getTireType() {
        return tireType;
    }

    public String getSuspension() {
        return suspension;
    }

    public void adjustSuspension(String newSuspension) {
        this.suspension = newSuspension;
    }

    public void adjustTyreType(String newTyreType) {
        this.tireType = newTyreType;
    }
}