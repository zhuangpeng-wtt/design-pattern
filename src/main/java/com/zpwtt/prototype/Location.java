package com.zpwtt.prototype;

public class Location implements Cloneable {
    StringBuilder street;
    int roomNo;

    public Location(StringBuilder street, int roomNo) {
        this.street = street;
        this.roomNo = roomNo;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Location{" +
                "street=" + street +
                ", roomNo=" + roomNo +
                '}';
    }
}
