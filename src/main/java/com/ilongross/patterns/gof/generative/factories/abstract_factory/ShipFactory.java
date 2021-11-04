package com.ilongross.patterns.gof.generative.factories.abstract_factory;

import com.ilongross.patterns.gof.generative.factories.model.Ship;
import com.ilongross.patterns.gof.generative.factories.model.Vehicle;

public class ShipFactory implements VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        var ship = new Ship();
        ship.setPower(300);
        return ship;
    }
}
