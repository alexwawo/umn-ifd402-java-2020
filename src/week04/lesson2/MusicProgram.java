package week04.lesson2;

public class MusicProgram {
    public static void main(String[] args) {
        Album album1 = new Album("2020", "My Love");
        Song song1 = new Song("Don't Say You Love Me", "Britney Spears");
        Song song2 = new Song("Blue Night", "Christina Aguilera");
        Song song3 = new Song("Crazy Love", "No Artist");
        Song.setGenre("Rock");

        album1.addSong(song1);
        album1.addSong(song2);
        album1.addSong(song3);

        for (Song i: album1.getSongs()) {
            System.out.println(i.getTitle());
        }
    }
}
