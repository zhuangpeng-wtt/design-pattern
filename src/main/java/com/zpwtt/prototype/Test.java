package com.zpwtt.prototype;

public class Test {

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();

        System.out.println("p1.loc == p2.loc? " + (p1.loc == p2.loc));

        p1.loc.street.reverse();
        System.out.println(p2.loc.street);
    }
}
