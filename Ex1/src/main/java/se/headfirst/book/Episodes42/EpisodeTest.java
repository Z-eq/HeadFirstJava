package se.headfirst.book.Episodes42;

public class EpisodeTest {
    public static void main(String[] args) {
        Episode episode = new Episode();

        episode.seriesNumber = 4;
        episode.episodeNumber= 5;
        episode.play();
        episode.skipIntro();
    }
}
