package com.itacademy.java.oop.basics;

public enum ContractType {
    FULL_TIME("FT"),
    PART_TIME("PT");

    private final String contractType;

    public String getContractType() {
        return contractType;
    }

    ContractType(String contractTypeCode) {
        this.contractType = contractTypeCode;
    }


    public static ContractType contractType(String inputContractTypeCode) {
        for (ContractType type : values()) {
            if (type.contractType.equals(inputContractTypeCode)) {
                return type;
            }
        }
        return null;
    }
}
