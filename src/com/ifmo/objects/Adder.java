package com.ifmo.objects;

public class Adder {
    private int value;
    private int step;

    public Adder(int step) {
        this.step = step;
    }

    public void add() {
        this.value += step;
    }

    public int getValue() {
        return value;
    }
}
