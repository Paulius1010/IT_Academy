package com.itacademy.java.oop.basics.task3;

public class MyBankAtm implements Atm{
    private double balance;

    public MyBankAtm(double balance) {
        this.balance = balance;
    }

    public MyBankAtm() {
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void refund(double fund) {
        this.balance += fund;
    }

    @Override
    public void withdraw(Card card, double amount) {
        if ((this.balance - amount) < 0) {
            throw new InsuficientAtmFundsException("Insufficient ATM funds");
        } else {
            card.debit(amount);
        }
    }
}
