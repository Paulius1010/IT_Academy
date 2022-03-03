package com.itacademy.java.oop.basics;

import java.time.LocalDate;

public class Loan {
    private LoanType loanType;
    private Integer amount;
    private Integer id;
    private LocalDate terminationDate;

    public Loan(LoanType loanType, Integer amount, Integer id, LocalDate terminationDate) {
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

    public void setLoanType(LoanType loanType) {
        this.loanType = loanType;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getTerminationDate() {
        return terminationDate;
    }

    public void setTerminationDate(LocalDate terminationDate) {
        this.terminationDate = terminationDate;
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
