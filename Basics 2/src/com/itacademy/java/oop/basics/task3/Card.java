package com.itacademy.java.oop.basics.task3;

public abstract class Card {
    protected double balance;
    protected String cardHolderName;
    protected String cardNumber;

    public Card(double balance, String cardHolderName, String cardNumber) {
        this.balance = balance;
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;
    }

    abstract void credit(double amount);

    abstract void debit(double amount);

}
