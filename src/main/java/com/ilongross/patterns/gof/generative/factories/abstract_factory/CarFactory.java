package com.ilongross.patterns.gof.generative.factories.abstract_factory;

import com.ilongross.patterns.gof.generative.factories.model.Car;
import com.ilongross.patterns.gof.generative.factories.model.Vehicle;

public class CarFactory implements VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        var car = new Car();
        car.setPower(100);
        return car;
    }
}
