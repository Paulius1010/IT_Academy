package com.itacademy.java.oop.basics.task2;

public class BicycleApplication {
    public static void main(String[] args) {

        MountainBike mountainBike = new MountainBike();
        RoadBike roadBike = new RoadBike();

        mountainBike.speedUp(40);
        mountainBike.changeGear(1);
        mountainBike.speedUp(40);
        mountainBike.applyBrakes(10);
        mountainBike.changeGear(1);

        roadBike.speedUp(45);
        roadBike.applyBrakes(-20);
        roadBike.changeGear(2);
        System.out.println("The faster is " + Speedometer.chooseWinner(mountainBike, roadBike) + " BIKE");
        mountainBike.applyBrakes(20);
        System.out.println("The faster is " + Speedometer.chooseWinner(mountainBike.getSpeed(), roadBike.getSpeed()) + " BIKE");

    }
}
