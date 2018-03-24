package com.Zee;

public class Burberry extends Watch {

    private int miniDial;
    private int hands;
    private int buckle;
    private String color;

    public Burberry(String brand, int model, int gems, int miniDial, int hands, int buckle, String color) {
        super(brand, 1, 2, model, gems);
        this.miniDial = miniDial;
        this.hands = hands;
        this.buckle = buckle;
        this.color = color;

    }
    private void manual() {
            System.out.println("Burberry.manual() called");
    }

    @Override
    public void time() {
        System.out.println("Burberry.time() called");
        manual();
        super.time();
    }

    public void wristwatch() {
        System.out.println("Burberry.wristwatch() called");
        type(5);
    }

    public void pocketwatch() {
        System.out.println("Burberry.pocketwatch() called");
        type(10);
    }

}
