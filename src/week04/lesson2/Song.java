package week04.lesson2;

public class Song {
    private String title, artist;
    private static String genre = "POP";
    public static String genre2 = "POP";

    // Constructor
    Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public static void setGenre(String newGenre) {
        genre = newGenre;
    }

    public static String getGenre() {
        return genre;
    }

    public String getTitle() {
        return this.title;
    }

}
