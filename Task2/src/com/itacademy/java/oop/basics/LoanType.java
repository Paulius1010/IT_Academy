package com.itacademy.java.oop.basics;

public enum LoanType {
    LEASING("L"),
    CONSUMER_LOAN("CL");

    public final String loanType;

    LoanType(String loanType) {
        this.loanType = loanType;
    }

    public String getLoanType() {
        return loanType;
    }
}
