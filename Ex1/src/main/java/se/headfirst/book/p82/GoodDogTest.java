package se.headfirst.book.p82;

public class GoodDogTest {
    public static void main(String[] args) {

        GoodDog dog1 = new GoodDog();

        dog1.setSize(20);

        GoodDog dog2 = new GoodDog();

        dog2.setSize(4);

        dog1.bark();
        System.out.println("Dog1: " + dog1.getSize());
        System.out.println("Dog2: " + dog2.getSize());

         dog1.bark();
    }
}
