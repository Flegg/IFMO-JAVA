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

    //    private Point center;
//    private Point point;
//
//
//    public Circle(Point center, Point point) {
//        this.center = center;
//        this.point = point;
//    }
//
//    public void square() {
//        double radius = Math.sqrt(Math.pow((point.getX() - center.getX()), 2) +
//                Math.pow((point.getY() - center.getY()), 2));
//        double square = Math.PI * Math.pow(radius, 2);
//        System.out.printf("Площадь круга = %.3f\n", square);
//    }
//
//    public void perimetr() {
//        double radius = Math.sqrt(Math.pow((point.getX() - center.getX()), 2) +
//                Math.pow((point.getY() - center.getY()), 2));
//        double perimetr = 2 * Math.PI * radius;
//        System.out.printf("Длина окружности = %.3f\n", perimetr);
//    }
}
