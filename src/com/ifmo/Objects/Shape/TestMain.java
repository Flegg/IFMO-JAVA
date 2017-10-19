package com.ifmo.Objects.Shape;

public class TestMain {
    public static void main(String[] args) {
        Circle circle = new Circle(new Point(0,0), new Point(0, 4));

        circle.square();
        circle.perimetr();

        Rectangle rectangle = new Rectangle(new Point(0, 0), new Point(4, 0), new Point(0, 6));
        rectangle.square();
        rectangle.perimetr();

        Triangle triangle = new Triangle(new Point(0,0), new Point(0, 4), new Point(2, 10));
        triangle.square();
        triangle.perimetr();
    }
}
