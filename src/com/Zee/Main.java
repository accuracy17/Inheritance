package com.Zee;

public class Main {

    public static void main(String[] args) {
        Watch watch = new Watch("Watch", 1, 2, 5, 5);
//
//        Burberry burberry = new Burberry("MotherOfPearl", 5416, 4, 2, 2, 3, "silver");
//        burberry.time();
//        burberry.wristwatch();
//        burberry.pocketwatch();


        Ziiiro ziiiro = new Ziiiro("BlackBeauty", 7398, 2, 7, 1, "mini");
        ziiiro.time();
        ziiiro.moveSmallwheel();
        ziiiro.moveBigwheel();

    }
}
