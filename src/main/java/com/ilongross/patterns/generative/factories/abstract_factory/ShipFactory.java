package com.ilongross.patterns.generative.factories.abstract_factory;

import com.ilongross.patterns.generative.factories.model.Ship;
import com.ilongross.patterns.generative.factories.model.Vehicle;

public class ShipFactory implements VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        var ship = new Ship();
        ship.setPower(300);
        return ship;
    }
}
