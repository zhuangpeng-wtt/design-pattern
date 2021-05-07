package com.zpwtt.bridge;

public class GG {
    public void chase() {
        Gift g = new WarmGift(new Flower());

        give(g);
    }

    private void give(Gift g) {
        System.out.println(g + "gived!");
    }
}
