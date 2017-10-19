package com.ifmo.Objects.Shape;

public class Rectangle {
    private Point x1;
    private Point x2;
    private Point y1;
    private Point y2;

    public Rectangle(Point x1, Point x2, Point y1) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = new Point(x2.getX(), y1.getY());
    }

    public void square() {
        double a = Math.sqrt(Math.pow((x2.getX() - x1.getX()), 2) + Math.pow((x2.getY() - x1.getY()), 2));
        double b = Math.sqrt(Math.pow((y1.getX() - x1.getX()), 2) + Math.pow((y1.getY() - x1.getY()), 2));
        double square = a * b;

        System.out.printf("Площадь прямоугольника = %.3f\n", square);
    }

    public void perimetr() {
        double a = Math.sqrt(Math.pow((x2.getX() - x1.getX()), 2) + Math.pow((x2.getY() - x1.getY()), 2));
        double b = Math.sqrt(Math.pow((y1.getX() - x1.getX()), 2) + Math.pow((y1.getY() - x1.getY()), 2));
        double perimetr = 2 * (a + b);

        System.out.printf("Площадь прямоугольника = %.3f\n", perimetr);
    }
}
