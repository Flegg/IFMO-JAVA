package com.ifmo.Objects.Shape;

class CoordinateOfPoint {
     double x;
     double y;

    public CoordinateOfPoint(double x) {
        this.x = x;
    }

    public CoordinateOfPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
