package com.itacademy.java.oop.basics.task3;

public class CreditCard extends Card{
    private double interest;
    private final double credit;

    public CreditCard(double balance, String cardHolderName, String cardNumber, double interest, double credit) {
        super(balance, cardHolderName, cardNumber);
        this.interest = interest;
        this.credit = credit;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public double getCredit() {
        return credit;
    }


    @Override
    void credit(double amount) {
        super.balance += amount;
        System.out.println("Credit card balance: " + this.balance);
    }

    @Override
    void debit(double amount) {
        double amountWithCharge = (amount * (100 + this.interest)/100);
        if ((super.balance + this.credit) - amountWithCharge < 0) {
            throw new NotEnoughtCreditException("Insufficient credit card limit.");
        } else {
            super.balance -= amountWithCharge;
            System.out.println("Credit card balance: " + this.balance);

        }
    }

}
