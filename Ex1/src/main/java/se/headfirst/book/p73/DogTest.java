package se.headfirst.book.p73;

public class DogTest {
    public static void main(String[] args) {

    Dog one = new Dog();

    one.setSize(70);
    Dog two = new Dog();
    two.setSize(8);

    Dog three = new Dog();
    three.setSize(35);


    one.name = "Hauu";
    two.name = " Goodo";
    three.name = "hej";

        one.bark(3);
    two.bark(0);
    three.bark(0);


    }
}
