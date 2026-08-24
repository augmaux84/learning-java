package problem_sets.collection_manipulation;

import java.util.ArrayList;

public class Playlist {
    private String name;
    private ArrayList<Song> songs;

    public void Playlist(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<Song> songs) {
        this.songs = songs;
    }

    public void addSong(Song song) {
        int counter = 0;

        for (Song songPlaylist : this.getSongs()) {
            if (songPlaylist.getId().equalsIgnoreCase(song.getId())) {
                counter += 1;
                break;
            }
        }

        if (counter != 0) {
            System.out.printf("Error: The song :.2f is already in the playlist.", song.getTitle());
        } else {
            this.songs.add(song);
        }
    }
}
