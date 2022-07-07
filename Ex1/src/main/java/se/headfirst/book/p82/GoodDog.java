package se.headfirst.book.p82;

public class GoodDog {

    private int size;

    public int getSize() {
        return size;

    }
    public void setSize(int s) {
        size = s;
    }

    void bark(){
        if (size > 60) {
            System.out.println("Woof  wooooof");
        } else if (size > 14) {
            System.out.println("Yap yap");
        }else{
            System.out.println("Mjau mjau");
        }
    }
}