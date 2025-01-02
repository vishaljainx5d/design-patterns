package dev.designpattern.strategy.withstrategypattern;

import dev.designpattern.strategy.withstrategypattern.strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle {

    public GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
