package com.itacademy.java.oop.basics.task2;

public enum Bike {
    MOUNTAIN("M"),
    ROAD("R");

    private final String bikeType;

    Bike(String bikeType) {
        this.bikeType = bikeType;
    }

    public String getBikeType() {
        return bikeType;
    }

    public static Bike valueOfCode(String inputBikeType) {
        for (Bike type : values()) {
            if (type.bikeType.equals(inputBikeType)) {
                return type;
            }
        }
        return null;
    }
}
