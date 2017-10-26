package com.ifmo.Objects.Shape;

class Square extends Rectangle {

    Square(CoordinateOfPoint a, CoordinateOfPoint c) {
        super(a, c);
    }

    @Override
    double perimeter() {
        return 4 * length(super.centerPoint, super.otherPoint);
    }

    @Override
    double area() {
        return Math.pow(length(super.centerPoint, super.otherPoint), 2);
    }
}
