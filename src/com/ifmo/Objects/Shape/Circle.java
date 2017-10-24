package com.ifmo.Objects.Shape;


public class Circle extends Shape {

    public Circle (CoordinateOfPoint c, CoordinateOfPoint o) {
        super(c, o);
    }

    @Override
    double area() {
        return Math.PI * Math.pow(length(centerPoint, otherPoint), 2);
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * length(centerPoint, otherPoint);
    }

}
