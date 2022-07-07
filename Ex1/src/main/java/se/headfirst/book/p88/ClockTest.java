package se.headfirst.book.p88;

public class ClockTest {

    public static void main(String[] args) {
         Clock c = new Clock();
         c.setTime("12345");
         String tod = c.getTime();
        System.out.println("time " + tod);
    }
}
