package com.Zee;

public class Ziiiro extends Watch {

    private int chain;
    private int minidial;
    private String bow;

    public Ziiiro(String brand, int model, int color, int chain, int minidial, String bow) {

        super(brand, 1, 1, model, color);
        this.chain = chain;
        this.minidial = minidial;
        this.bow = bow;
    }

    private void balancewheel() {

    }

    public void moveSmallwheel() {
        System.out.println("Ziiiro.moveSmallwheel() called");
        type(3);

    }
    public void moveBigwheel() {
        System.out.println("Ziiiro.moveBigwheel() called");
        type(5);

    }
    public void regulator(int size) {
        moveSmallwheel();
        moveBigwheel();
        super.type(size);

    }
}
