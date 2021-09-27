package com.ilongross.patterns.generative.factories.abstract_factory;

import com.ilongross.patterns.generative.factories.model.Plane;
import com.ilongross.patterns.generative.factories.model.Vehicle;

public class PlaneFactory implements VehicleFactory{

    @Override
    public Vehicle createVehicle() {
        var plane = new Plane();
        plane.setPower(300);
        return plane;
    }
}
