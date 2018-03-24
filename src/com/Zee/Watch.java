package com.Zee;

public class Watch {

    private String brand;
    private int dials;
    private int straps;
    private int model;
    private int gems;

    public Watch(String brand, int dials, int straps, int model, int color) {
        this.brand = brand;
        this.dials = dials;
        this.straps = straps;
        this.model = model;
        this.gems = gems;
    }

    public void time() {
        System.out.println("Watch.time() called");

    }

    public void type(int size) {
        System.out.println("Burberry is " +size);

    }

    public String getBrand() {
        return brand;
    }

    public int getDials() {
        return dials;
    }

    public int getStraps() {
        return straps;
    }

    public int getModel() {
        return model;
    }

    public int getGems() {
        return gems;
    }
}
