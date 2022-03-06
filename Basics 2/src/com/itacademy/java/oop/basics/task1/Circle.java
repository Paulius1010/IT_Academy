package com.itacademy.java.oop.basics.task1;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.pow(this.radius, 2) * Math.PI;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public String toString() {
        return "circle. Its area=" + calculateArea() +
                ", perimeter=" + calculatePerimeter() +
                '.';
    }
}
