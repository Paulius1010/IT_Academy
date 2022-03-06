package com.itacademy.java.oop.basics.task3;

public class NotEnoughtCreditException extends RuntimeException{

    public NotEnoughtCreditException() {
    }

    public NotEnoughtCreditException(String message) {
        super(message);
    }
}
