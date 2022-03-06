package com.itacademy.java.oop.basics;
public class Square {
    private double length;
    private double width;

    public Square(double height, double width) {
        this.length = height;
        this.width = width;
    }

    public Square() {
    }

    public double getLength() {
        return length;
    }

    public void setLength(double height) {
        this.length = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}

