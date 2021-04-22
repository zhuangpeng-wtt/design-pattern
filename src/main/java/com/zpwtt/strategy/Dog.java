package com.zpwtt.strategy;

public class Dog {
    int height;
    int weight;

    public Dog(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
    }
}
