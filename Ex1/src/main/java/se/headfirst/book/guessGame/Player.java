package se.headfirst.book.guessGame;

public class Player {

    public int number;

    public void guess() {
        number = (int) (Math.random() * 10);
    }
}
