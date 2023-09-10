package session13.practice.bird;

public class Ostrich extends Bird {

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Can't fly.");
    }
}