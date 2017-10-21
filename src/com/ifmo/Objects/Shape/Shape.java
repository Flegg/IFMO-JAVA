package com.ifmo.Objects.Shape;

public class Shape {

    CoordinateOfPoint centerPoint;
    CoordinateOfPoint otherPoint;

    public Shape(CoordinateOfPoint centerPoint, CoordinateOfPoint otherPoint) {
        this.centerPoint = centerPoint;
        this.otherPoint = otherPoint;
    }

    public Shape(CoordinateOfPoint centerPoint) {
        this.centerPoint = centerPoint;
    }

    double length(CoordinateOfPoint a, CoordinateOfPoint b) {
        return Math.sqrt(Math.pow(b.getX() - a.getX(), 2) + Math.pow(b.getY() - a.getY(), 2));
    }

    double perimeter() {
        return 0;
    }

    double area() {
        return 0;
    }

}
