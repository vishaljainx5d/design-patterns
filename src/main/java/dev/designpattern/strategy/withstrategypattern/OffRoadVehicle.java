package dev.designpattern.strategy.withstrategypattern;

import dev.designpattern.strategy.withstrategypattern.strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle {

    public OffRoadVehicle() {
        super(new SportsDriveStrategy());
    }
}
