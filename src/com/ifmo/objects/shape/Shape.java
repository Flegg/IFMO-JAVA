package com.ifmo.objects.shape;

abstract class Shape {

    CoordinateOfPoint centerPoint;
    CoordinateOfPoint otherPoint;

    Shape(CoordinateOfPoint centerPoint, CoordinateOfPoint otherPoint) {
        this.centerPoint = centerPoint;
        this.otherPoint = otherPoint;
    }

    Shape(CoordinateOfPoint centerPoint) {
        this.centerPoint = centerPoint;
    }

    double length(CoordinateOfPoint a, CoordinateOfPoint b) {
        return Math.sqrt(Math.pow(b.getX() - a.getX(), 2) + Math.pow(b.getY() - a.getY(), 2));
    }

    abstract double perimeter();
    abstract double area() ;

}
