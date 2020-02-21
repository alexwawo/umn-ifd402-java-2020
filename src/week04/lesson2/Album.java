package week04.lesson2;

import java.util.ArrayList;

public class Album {
    private String year, title;
    public ArrayList<Song> songs = new ArrayList<Song>();

    Album(String year, String title) {
        this.year = year;
        this.title = title;
    }

    public void addSong(Song song) {
        this.songs.add(song);
    }

    public ArrayList<Song> getSongs() {
        return this.songs;
    }


}
