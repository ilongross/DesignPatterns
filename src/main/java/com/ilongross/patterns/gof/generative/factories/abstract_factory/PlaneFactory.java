package com.ilongross.patterns.gof.generative.factories.abstract_factory;

import com.ilongross.patterns.gof.generative.factories.model.Plane;
import com.ilongross.patterns.gof.generative.factories.model.Vehicle;

public class PlaneFactory implements VehicleFactory{

    @Override
    public Vehicle createVehicle() {
        var plane = new Plane();
        plane.setPower(300);
        return plane;
    }
}
