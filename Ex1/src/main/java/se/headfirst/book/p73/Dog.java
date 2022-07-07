package se.headfirst.book.p73;

public class Dog {


    private int size;
    String name;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    void bark(int numOfBarks ){
        while (numOfBarks > 0) {
            System.out.println("RUFFFFFFFF");
            numOfBarks = numOfBarks -1;
        }
        if (size > 60) {
            System.out.println("Woof!");
        } else if (size > 14) {
            System.out.println(name + " " + "Ruff ruff");
        }else {
            System.out.println("Yip yip");


        }
    }
}
