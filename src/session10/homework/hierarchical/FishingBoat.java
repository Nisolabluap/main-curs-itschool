package session10.homework.hierarchical;

public class FishingBoat extends Boat {

    protected int fishCapacity;
    protected String typeOfNet;

    public int getFishCapacity() {
        return fishCapacity;
    }

    public String getTypeOfNet() {
        return typeOfNet;
    }

    public void setFishCapacity(int fishCapacity) {
        this.fishCapacity = fishCapacity;
    }

    public void setTypeOfNet(String typeOfNet) {
        this.typeOfNet = typeOfNet;
    }

    public void castNet() {
        System.out.println("The net is cast.");
    }

    @Override
    public String toString() {
        return "Length: " + getLength()
                + "\nWeight: " + getWeight()
                + "\nFish capacity: " + getFishCapacity()
                + "\nNet type: " + getTypeOfNet();
    }
}