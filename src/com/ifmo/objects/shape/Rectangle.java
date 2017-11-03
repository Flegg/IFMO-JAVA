package com.ifmo.objects.shape;

class Rectangle extends Shape {

    private CoordinateOfPoint x1;
    private CoordinateOfPoint y1;

    Rectangle(CoordinateOfPoint a, CoordinateOfPoint c) {
        super(a, c);
        this.x1 = new CoordinateOfPoint(a.getY(), c.getX());
        this.y1 = new CoordinateOfPoint(a.getX(), c.getY());
    }

    @Override
    double perimeter() {
        return 2 * (length(centerPoint, y1) + length(centerPoint, x1));
    }

    @Override
    double area() {
        return length(centerPoint, y1) * length(centerPoint, x1);
    }
}
