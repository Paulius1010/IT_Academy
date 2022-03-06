package com.itacademy.java.oop.basics.task3;

public class DebitCard extends Card {


    public DebitCard(double balance, String cardHolderName, String cardNumber) {
        super(balance, cardHolderName, cardNumber);
    }

    @Override
    void credit(double amount) {
        super.balance += amount;
        System.out.println("Debit card balance: " + this.balance);

    }

    @Override
    void debit(double amount) {
        if ((super.balance - amount) < 0) {
            throw new NotEnoughBalanceException("Insufficient debit card balance.");
        } else {
            super.balance -= amount;
            System.out.println("Debit card balance: " + this.balance);

        }
    }

}



