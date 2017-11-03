package com.ifmo.objects.shape;

class CoordinateOfPoint {
     private double x;
     private double y;

     CoordinateOfPoint(double x) {
        this.x = x;
    }

     CoordinateOfPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

     double getX() {
        return x;
    }

     double getY() {
        return y;
    }
}
