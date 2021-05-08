package com.zpwtt.state;

public class People {
    String name;
    State peopleState = new HappyState();

    public void smile() {
        peopleState.smile();
    }

    public void cry() {
        peopleState.cry();
    }

    public void say() {
        peopleState.say();
    }
}
