package com.ifmo.objects.accumulator;

public class TestMain {
    public static void main(String[] args) {
        Accumulator acc = new Accumulator(2, new Power(), new Multiply(), new Minus(), new Plus(), new Divide());
        acc.accumulate(3);
        System.out.println(acc.getValue());
    }

}
