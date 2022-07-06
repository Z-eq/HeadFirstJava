package se.headfirst.book.Drumkit43;

import java.util.Scanner;

public class DrumkitTest {

    public static void main(String[] args) {
        Drumkit d = new Drumkit();
        d.playSnare();
        d.snare = false;
        d.playTopHat();

        if (d.snare == true) {

            d.playSnare();
        }

    }

}
