package com.zpwtt.builder;

public class Main {

    public static void main(String[] args) {
        TerrainBuilder builder = new ComplexTerrainBuilder();

        Terrain terrain = builder.buildFort().buildMine().buildWall().build();
    }
}
