package com.itacademy.java.oop.basics;

public enum ContractType {
    FULL_TIME("FT"),
    PART_TIME("PT");

    public final String contractType;

    ContractType(String contractTypeCode) {
        this.contractType = contractTypeCode;
    }
}
