package se.headfirst.book.P76;

public class ElectricGuiitarTest {
    public static void main(String[] args) {

        ElectricGuitar el = new ElectricGuitar();

        el.brand = "WOW";
        el.numOfPickups = 2;
        el.rockStarUsesIt = true;

        el.setBrand("wow2");
        
        el.setNumOfPickups(4);
        System.out.print("The brand is " + el.brand);
    }
}
