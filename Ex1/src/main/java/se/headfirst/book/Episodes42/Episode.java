package se.headfirst.book.Episodes42;

public class Episode {
    int seriesNumber;
    int episodeNumber;
      void play(){
        System.out.println("Playing " + episodeNumber);

    }
    void skipIntro() {
        System.out.println("Skipping intro...");
    }
    void skitNext(){
        System.out.println("Loading next episdode...");
    }
}
 