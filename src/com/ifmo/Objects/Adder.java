package com.ifmo.Objects;

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

    public static void main(String[] args) {
        Adder adder = new Adder(10);
        System.out.println(adder.getValue());
        adder.add();
        System.out.println(adder.getValue());

    }
}
