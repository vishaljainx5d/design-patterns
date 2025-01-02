package dev.designpattern.strategy.withstrategypattern.strategy;

public class SportsDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Sports Drive Capability");
    }
}
