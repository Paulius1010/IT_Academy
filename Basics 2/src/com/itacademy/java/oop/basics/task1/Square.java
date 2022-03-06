package com.itacademy.java.oop.basics.task1;

public class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    double calculateArea() {
        return Math.pow(this.side, 2);
    }

    @Override
    double calculatePerimeter() {
        return 4 * this.side;
    }

    @Override
    public String toString() {
        return "square. Its area=" + calculateArea() +
                ", perimeter=" + calculatePerimeter() +
                '.';
    }
}
