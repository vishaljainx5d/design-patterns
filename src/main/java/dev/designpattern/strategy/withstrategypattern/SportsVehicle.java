package dev.designpattern.strategy.withstrategypattern;

import dev.designpattern.strategy.withstrategypattern.strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {

    public SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
