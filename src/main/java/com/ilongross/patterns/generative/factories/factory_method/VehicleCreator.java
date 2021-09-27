package com.ilongross.patterns.generative.factories.factory_method;

import com.ilongross.patterns.generative.factories.model.Car;
import com.ilongross.patterns.generative.factories.model.Ship;
import com.ilongross.patterns.generative.factories.model.Plane;
import com.ilongross.patterns.generative.factories.model.Vehicle;

public class VehicleCreator {

    public static Vehicle createVehicle(String type) {
        switch (type) {
            case "plane":
                return new Plane();
            case "car":
                return new Car();
            case "ship":
                return new Ship();
        }
        return null;
    }

}
