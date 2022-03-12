package com.itacademy.java.oop.basics.collections;

public enum CountryCode {
    GB("GB"),
    PM("PM"),
    AW("AW"),
    LY("LY"),
    MW("MW"),
    CA("CA"),
    BM("BM");

    private final String countryCode;

    CountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public static CountryCode valueOfCode(String inputCountryCode) {
        for (CountryCode type : values()) {
            if (type.countryCode.equals(inputCountryCode)) {
                return type;
            }
        }
        return null;
    }
}
