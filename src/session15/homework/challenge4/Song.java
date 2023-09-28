package session15.homework.challenge4;

import java.util.Objects;

public class Song {

    private String title;
    private String artist;
    private int length;

    public Song(String title, String artist, int length) {
        this.title = title;
        this.artist = artist;
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return Objects.equals(title, song.title) &&
                Objects.equals(artist, song.artist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, artist);
    }

    public static void main(String[] args) {
        Song song1 = new Song("Sun", "Paul", 4);
        Song song2 = new Song("Sun", "Paul", 4);
        Song song3 = new Song("Moon", "Joe", 4);

        System.out.println(song1.equals(song2));
        System.out.println(song1.equals(song3));

        System.out.println(song1.hashCode());
        System.out.println(song2.hashCode());
        System.out.println(song3.hashCode());

        System.out.println("Should have the same hasCode: " +
                (song1.hashCode() == song2.hashCode()));
    }
}