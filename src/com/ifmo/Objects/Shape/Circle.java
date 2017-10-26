package com.ifmo.Objects.Shape;


class Circle extends Shape {

    Circle (CoordinateOfPoint c, CoordinateOfPoint o) {
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
