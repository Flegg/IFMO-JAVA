package com.ifmo.Objects.Shape;

class Triangle extends Shape {
    private CoordinateOfPoint c;

    private boolean isExist;
    private double ab;
    private double ac;
    private double bc;

    Triangle(CoordinateOfPoint a, CoordinateOfPoint b, CoordinateOfPoint c) {
        super(a, b);
        this.c = c;
    }

    private void sideCalculation() {
        ab = length(centerPoint, otherPoint);
        ac = length(centerPoint, c);
        bc = length(otherPoint, c);
    }

    private boolean isExist() {
        sideCalculation();
        if (ab > 0 && ac > 0 && bc > 0) {
            if (ab + bc > ac | ab + ac > bc | ac + bc > ab)
                isExist = true;
        }
        else
            isExist = false;

        return isExist;
    }

    @Override
    double area() {

        if (isExist()) {
            double p = (ab + ac + bc) / 2;
            return Math.sqrt(p * (p - ac) * (p - ab) * (p - bc));
        }
        else {
            System.out.println("Треугольник не существует!");
            return 0;
        }
    }

    @Override
    double perimeter() {
        isExist();
        if (isExist) {
            return ab + ac + bc;
        }
        else {
            System.out.println("Треугольник не существует!");
            return 0;
        }
    }
}
