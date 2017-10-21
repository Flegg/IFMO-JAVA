package com.ifmo.Objects.Shape;

public class Ellipse extends Shape {

    CoordinateOfPoint smallRadius;
    CoordinateOfPoint bigRadius;

    public Ellipse(CoordinateOfPoint centerPoint, CoordinateOfPoint smallRadius, CoordinateOfPoint bigRadius) {
        super(centerPoint);
        this.smallRadius = new CoordinateOfPoint(centerPoint.getX(), smallRadius.getX());
        this.bigRadius = new CoordinateOfPoint(bigRadius.getX(), centerPoint.getY());
    }

    @Override
    double area() {
        return Math.PI * length(centerPoint, smallRadius) * length(centerPoint, bigRadius);
    }

    @Override
    double perimeter() {
        return 4 * (((Math.PI * length(centerPoint, bigRadius) * length(centerPoint, smallRadius)) +
                Math.pow(length(centerPoint, bigRadius ) - length( centerPoint, smallRadius), 2)) /
                (length(centerPoint, bigRadius) + length(centerPoint, smallRadius)));
    }
}
