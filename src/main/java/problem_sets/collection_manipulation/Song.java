package problem_sets.collection_manipulation;

public class Song {
    private final String id;
    private final String title;
    private final String artist;
    private final int durationInSeconds;

    public Song(String id, String title, String artist, int durationInSeconds) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.durationInSeconds = durationInSeconds;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getDurationInSeconds() {
        return durationInSeconds;
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public String toString() {
        return "Song{id='" + this.id + "', title='" + this.title + "', artist='" + this.artist + "', duration='" + this.durationInSeconds + "s'}";
    }
}
