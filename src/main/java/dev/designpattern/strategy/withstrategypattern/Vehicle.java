package dev.designpattern.strategy.withstrategypattern;

import dev.designpattern.strategy.withstrategypattern.strategy.DriveStrategy;

public class Vehicle {

    DriveStrategy driveStrategy;

    Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        driveStrategy.drive();
    }
}
