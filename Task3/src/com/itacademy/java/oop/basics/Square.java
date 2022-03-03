package com.itacademy.java.oop.basics;
public class Square {
    private Double length;
    private Double width;

    public Double getLength() {
        return length;
    }

    public void setLength(Double height) {
        this.length = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Square{" +
                "height=" + length +
                ", width=" + width +
                '}';
    }

    public Square(Double height, Double width) {
        this.length = height;
        this.width = width;
   }

    public Square() {
    }
}

