package com.itacademy.java.oop.basics;

import java.util.ArrayList;
import java.util.List;

public class ShapeApplication {

    public static void main(String[] args) {

        List<Square> squares = new ArrayList<Square>();

        Square square1 = new Square(1.1, 1.2);
        Square square2 = new Square(4.1, -89.2);
        Square square3 = new Square(-44.6, 4.9);
        Square square4 = new Square(566.1, 789.6);
        Square square5 = new Square();
        Square square6 = new Square();
        Square square7 = new Square(45.6, 78.0);
        square6.setLength(45.5);
        square6.setWidth(69.7);

        squares.add(square1);
        squares.add(square2);
        squares.add(square3);
        squares.add(square4);
        squares.add(square5);
        squares.add(square6);
        squares.add(square7);

        for (Square square : squares) {
            if (square.getLength()!=null && square.getWidth()!=null && square.getLength() > 0 && square.getWidth() > 0) {
            Double area = square.getLength()*square.getWidth();
            Double perimeter = 2*(square.getLength()+square.getWidth());
                System.out.println("Square: " + area + ", perimeter: " + perimeter);
            }
        }



    }
}
