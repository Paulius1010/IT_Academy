package com.itacademy.java.oop.basics.task3;

public class NotEnoughBalanceException extends RuntimeException{

    public NotEnoughBalanceException() {
    }

    public NotEnoughBalanceException(String message) {
        super(message);
    }
}
