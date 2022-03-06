package com.itacademy.java.oop.basics;

public enum LoanType {
    LEASING("L"),
    CONSUMER_LOAN("CL");

    private final String loanType;

    LoanType(String loanType) {
        this.loanType = loanType;
    }

    public String getLoanType() {
        return loanType;
    }

    public static LoanType valueOfCode(String inputLoanType) {
        for (LoanType type : values()) {
            if (type.loanType.equals(inputLoanType)) {
                return type;
            }
        }
        return null;
    }
}
