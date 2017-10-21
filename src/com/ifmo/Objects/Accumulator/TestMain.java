package com.ifmo.Objects.Accumulator;

public class TestMain {
    public static void main(String[] args) {
        Accumulator acc = new Accumulator(2, new Power());
        acc.accumulate(3);
        System.out.println(acc.getValue());
    }

}
