package com.ifmo.Objects.Shape;

public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    private double ab;
    private double ac;
    private double bc;

    private boolean isExist;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private void sideCalculation() {
        ab = Math.sqrt(Math.pow(b.getX() - a.getX(), 2) + Math.pow(b.getY() - a.getY(), 2));
        ac = Math.sqrt(Math.pow(c.getX() - a.getX(), 2) + Math.pow(c.getY() - a.getY(), 2));
        bc = Math.sqrt(Math.pow(c.getX() - b.getX(), 2) + Math.pow(c.getY() - b.getY(), 2));
        System.out.println(ab + " " + ac + " " + bc);
    }

    private boolean isExist() {
        sideCalculation();
        if (ab + bc > ac | ab + ac > bc | ac + bc > ab)
            isExist = true;
        else
            isExist = false;

        return isExist;
    }

    public void square() {
        isExist();
        if (isExist) {
            double p = (ab + ac + bc) / 2;
            double square = Math.sqrt(p * (p - ac) * (p - ab) * (p - bc));
            System.out.printf("Площадь треугольника = %.03f\n", square);
        }
        else
            System.out.println("Треугольник не существует!");
    }

    public void perimetr() {
        isExist();
        if (isExist) {
            double p = ab + ac + bc;
            System.out.printf("Периметр треугольника = %.03f\n", p);
        }
        else
            System.out.println("Треугольник не существует!");
    }
}
