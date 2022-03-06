package com.itacademy.java.oop.basics;

import java.time.LocalDate;

public class Loan {
    private LoanType loanType;
    private int amount;
    private String id;
    private LocalDate terminationDate;

    public Loan(LoanType loanType, int amount, String id, LocalDate terminationDate) {
        this.loanType = loanType;
        this.amount = amount;
        this.id = id;
        this.terminationDate = terminationDate;
    }

    public Loan() {
    }

    public LoanType getLoanType() {
        return loanType;
    }


    public int getAmount() {
        return amount;
    }


    public String getId() {
        return id;
    }


    public LocalDate getTerminationDate() {
        return terminationDate;
    }


    @Override
    public String toString() {
        return "Loan{" +
                "loanType=" + loanType +
                ", amount=" + amount +
                ", id=" + id +
                ", terminationDate=" + terminationDate +
                '}';
    }
}
