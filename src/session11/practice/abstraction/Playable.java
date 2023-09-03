package session11.practice.abstraction;

public interface Playable {

    void play();

    void stop();
}

class Music implements Playable {

    @Override
    public void play() {
        System.out.println("Music is playing.");
    }

    @Override
    public void stop() {
        System.out.println("Music has stopped.");
    }
}

class Video implements Playable {

    @Override
    public void play() {
        System.out.println("The video is playing.");
    }

    @Override
    public void stop() {
        System.out.println("The video has stooped.");
    }
}