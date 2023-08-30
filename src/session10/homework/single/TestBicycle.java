package session10.homework.single;

public class TestBicycle {

    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike();
        mountainBike.adjustSuspension("medium");
        mountainBike.adjustTyreType("clincher");
        mountainBike.changeGear(3);
        mountainBike.speedUp(10);
        mountainBike.applyBrake(5);

        System.out.println("MountainBike\n" + "Suspension: " + mountainBike.getSuspension() +
                "\nTyre type: " + mountainBike.getTireType() +
                "\nGear: " + mountainBike.getGear() + "\nSpeed: " + mountainBike.getSpeed() + " km/h");
    }
}