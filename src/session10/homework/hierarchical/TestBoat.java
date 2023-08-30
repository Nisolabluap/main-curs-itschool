package session10.homework.hierarchical;

import java.io.PrintStream;

public class TestBoat {

    public static void main(String[] args) {
        SpeedBoat speedBoat = new SpeedBoat();
        System.out.println("Speedboat");
        speedBoat.setLength(10);
        speedBoat.setWeight(500);
        speedBoat.setMaxSpeed(50);
        speedBoat.setEngineType("Jet");
        speedBoat.sail();
        speedBoat.turboBoost("on");
        System.out.println(speedBoat);

        System.out.println();
        FishingBoat fishingBoat = new FishingBoat();
        System.out.println("Fishing boat");
        fishingBoat.setLength(30);
        fishingBoat.setWeight(1500);
        fishingBoat.setFishCapacity(500);
        fishingBoat.setTypeOfNet("Trawling");
        fishingBoat.sail();
        fishingBoat.castNet();
        System.out.println(fishingBoat);
    }
}