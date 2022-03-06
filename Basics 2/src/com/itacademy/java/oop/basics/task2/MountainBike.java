package com.itacademy.java.oop.basics.task2;

public class MountainBike implements Bicycle{
    private Bike type;
    private int speed;
    private int gear;

    public MountainBike() {
        this.type = Bike.MOUNTAIN;
        this.speed = 0;
        this.gear = 0;
    }


    public Bike getType() {
        return type;
    }

    public int getSpeed() {
        return speed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    @Override
    public void changeGear(int newGear) {
        if (newGear == -1) {
            if (this.gear <= 0) {
                System.out.println("The gear cannot be lower than 0. You can only increase gear.");
            } else {
                this.gear--;
                System.out.println("The gear number is " + this.gear + ".");
            }
        } else if (newGear == 1) {
            if (this.gear >= 20) {
                System.out.println("The gear cannot be higher than 20. You can only decrease gear.");
            } else {
                this.gear++;
                System.out.println("The gear number is " + this.gear + ".");
            }
        } else {
            System.out.println("The value is not allowed. Please use only 1 and -1");
        }
    }

    @Override
    public void speedUp(int increment) {
        if (this.gear == 0) {
            System.out.println("You need to increment gear, because 0 gear does not ride.");
        } else {
            if (increment < 0) {
                System.out.println("The value should be positive.");
            } else {
                if (this.speed + increment > 100) {
                    int maxIncrement = 100 - this.speed;
                    System.out.println("The value is too high. The highest possible value to use to speed up a mountain bike is " + maxIncrement + ".");
                } else {
                    this.speed += increment;
                    System.out.println("The speed of mountain bike is " + this.speed + ".");
                }
            }
        }
    }


    @Override
    public void applyBrakes(int decrement) {
        if (this.gear == 0) {
            System.out.println("You need to increment gear, because 0 gear does not brake.");
        } else {
            if (decrement < 0) {
                System.out.println("The value should be positive.");
            } else {
                if (this.speed - decrement < -10) {
                    int maxDecrement = this.speed + 10;
                    System.out.println("The value is too high. The highest possible value to use to brake a mountain bike is " + maxDecrement + ".");
                } else {
                    this.speed -= decrement;
                    System.out.println("The speed of mountain bike is " + this.speed + ".");
                }
            }
        }
    }
}
