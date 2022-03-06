package com.itacademy.java.oop.basics.task1;

public abstract class Shape {

    abstract double calculateArea();

    abstract double calculatePerimeter();

    @Override
    public String toString() {
        return "Shape type: ";
    }
}
