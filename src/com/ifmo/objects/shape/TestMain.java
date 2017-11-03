package com.ifmo.objects.shape;

public class TestMain {
    public static void main(String[] args) {

        Shape ellipse = new Ellipse(new CoordinateOfPoint(0, 0), new CoordinateOfPoint(2),
                new CoordinateOfPoint(4));
        Shape triangle = new Triangle(new CoordinateOfPoint(0, 0), new CoordinateOfPoint(0, 0),
                new CoordinateOfPoint(4, 0));
        Shape circle = new Circle(new CoordinateOfPoint(0, 0), new CoordinateOfPoint(0, 4));
        Shape rectangle = new Rectangle(new CoordinateOfPoint(0, 0), new CoordinateOfPoint(8,2));
        Shape square = new Square(new CoordinateOfPoint(0, 0), new CoordinateOfPoint(5, 0));

        System.out.println("Площадь эллипса = " + ellipse.area());
        System.out.println("Периметр эллипса = " + ellipse.perimeter());
        System.out.println("Периметр прямоугольника = " + rectangle.perimeter());
        System.out.println("Площадь прямоугольника = " + rectangle.area());
        System.out.println("Площадь треугольника = " + triangle.area());
        System.out.println("Периметр треугольника = " + triangle.perimeter());
        System.out.println("Площадь круга = " + circle.area());
        System.out.println("Периметр круга = " + circle.perimeter());
        System.out.println("Площадь квадрата = " + square.area());
        System.out.println("Периметр квадрата = " + square.perimeter());

    }
}
