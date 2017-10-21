package com.ifmo.Objects.Shape;

public class TestMain {
    public static void main(String[] args) {

        Ellipse ellipse = new Ellipse(new CoordinateOfPoint(0, 0), new CoordinateOfPoint(2),
                new CoordinateOfPoint(4));

        System.out.println("Площадь эллипса = " + ellipse.area());
        System.out.println("Периметр эллипса = " + ellipse.perimeter());

        Rectangle rectangle = new Rectangle(new CoordinateOfPoint(0, 0), new CoordinateOfPoint(8,2));
        System.out.println("Периметр прямоугольника = " + rectangle.perimeter());
        System.out.println("Площадь прямоугольника = " + rectangle.area());

        Triangle triangle = new Triangle(new CoordinateOfPoint(0, 0), new CoordinateOfPoint(0, 0),
                new CoordinateOfPoint(4, 0));

        System.out.println("Площадь треугольника = " + triangle.area());
        System.out.println("Периметр треугольника = " + triangle.perimeter());

        Circle circle = new Circle(new CoordinateOfPoint(0, 0), new CoordinateOfPoint(0, 4));

        System.out.println("Площадь круга = " + circle.area());
        System.out.println("Периметр круга = " + circle.perimeter());

        Square square = new Square(new CoordinateOfPoint(0, 0), new CoordinateOfPoint(5, 0));

        System.out.println("Площадь квадрата = " + square.area());
        System.out.println("Периметр квадрата = " + square.perimeter());

    }
}
