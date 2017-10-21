package com.ifmo.Objects.Accumulator;

public class Accumulator {
    private double value;
    private Operation[] operation;

    public Accumulator(double value, Operation... operation) {
        this.value = value;
        this.operation = operation;
    }

    public void accumulate(double var) {
        for (Operation op : operation) {
            value = op.operation(value, var);
        }
    }

    public double getValue() {
        return value;
    }
}
