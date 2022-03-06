package com.itacademy.java.oop.basics.task2;

public class RoadBike implements Bicycle{
    private Bike type;
    private int speed;
    private int gear;

    public RoadBike() {
        this.type = Bike.ROAD;
        this.speed = 0;
        this.gear = 1;
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

    @Override
    public void changeGear(int newGear) {
        if (newGear == -1) {
            if (this.gear + newGear < 0) {
                System.out.println("The gear cannot be lower than 0. You can only increase the gear.");
            } else {
                this.gear--;
                System.out.println("The gear number is " + this.gear + ".");
            }
        } else if (newGear == -2) {
            if (this.gear + newGear < 0) {
                System.out.println("The gear cannot be lower than 0. You can only decrease the gear by one or increase.");
            } else {
                this.gear--;
                System.out.println("The gear number is " + this.gear + ".");
            }
        }  else if (newGear == 1) {
            if (this.gear + newGear > 10) {
                System.out.println("The gear cannot be higher than 10. You can only decrease the gear.");
            } else {
                this.gear++;
                System.out.println("The gear number is " + this.gear + ".");
            }
        } else if (newGear == 2) {
            if (this.gear + newGear > 10) {
                System.out.println("The gear cannot be higher than 10. You can only increase the gear by one or decrease.");
            } else {
                this.gear++;
                System.out.println("The gear number is " + this.gear + ".");
            }
        } else {
            System.out.println("The value is not allowed. Please use the closest allowed value in regards to your supplied value.");
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
                if (this.speed + increment * this.gear > 50) {
                    int maxIncrement = 50 - this.speed;
                    System.out.println("The value is too high. The highest possible value to use to speed up a road bike is " + maxIncrement + ".");
                } else {
                    this.speed += increment;
                    System.out.println("The speed of road bike is " + this.speed + ".");
                }
            }
        }
    }


    @Override
    public void applyBrakes(int decrement) {
        if (decrement > 0) {
            System.out.println("The value should be negative.");
        } else
        if (this.speed + decrement < 0) {
            int maxDecrement = this.speed;
            System.out.println("The value is too high. The highest possible value to use to brake a road bike is " + maxDecrement + ".");
        } else {
            this.speed += decrement;
            System.out.println("The speed of road bike is " + this.speed + ".");
        }
    }
}
