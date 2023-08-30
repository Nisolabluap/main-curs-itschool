package session10.homework.hierarchical;

public class Boat {

    private int length;
    private int weight;

    public int getLength() {
        return length;
    }

    public int getWeight() {
        return weight;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void sail() {
        System.out.println("The boat is sailing.");
    }
}