package com.ilongross.patterns.gof.generative.factories;

import com.ilongross.patterns.gof.generative.factories.abstract_factory.CarFactory;
import com.ilongross.patterns.gof.generative.factories.builder.ShipBuilder;
import com.ilongross.patterns.gof.generative.factories.factory_method.VehicleCreator;

import java.util.Objects;

public class DemoFactory {

    private static final CarFactory carFactory = new CarFactory();

    public static void main(String[] args) {

        var car = VehicleCreator.createVehicle("car");
        Objects.requireNonNull(car, "Car must not be null!").move();

        var vehicle = carFactory.createVehicle();
        vehicle.move();

        try {
            var ship = new ShipBuilder()
                    .setModel("U-345")
                    .setName("Ilon Gross")
                    .setDecks(0)
                    .setLength(9)
                    .build();
            System.out.println(ship);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
