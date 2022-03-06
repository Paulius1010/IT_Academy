package com.itacademy.java.oop.basics.task2;

public class Speedometer {

    public static Bike chooseWinner(MountainBike mountainBike, RoadBike roadBike) {
        if (mountainBike.getSpeed() > roadBike.getSpeed()) {
            return mountainBike.getType();
        } else if (mountainBike.getSpeed() < roadBike.getSpeed()) {
            return roadBike.getType();
        } else {
            System.out.println("Mountain bike speed equals road bike speed.");
            return null;
        }

    }
    public static Bike chooseWinner(int mountainBikeSpeed, int roadBikeSpeed) {
        if (mountainBikeSpeed > roadBikeSpeed) {
            return Bike.MOUNTAIN;
        } else if (mountainBikeSpeed < roadBikeSpeed) {
            return Bike.ROAD;
        } else {
            System.out.println("Mountain bike speed equals road bike speed.");
            return null;
        }
    }
}
