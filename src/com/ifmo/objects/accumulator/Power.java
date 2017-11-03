package com.ifmo.objects.accumulator;

public class Power extends Operation{

    @Override
    public double operation(double a, double b) {
        return Math.pow(a, b);
    }
}
