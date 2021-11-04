package com.ilongross.patterns.gof.structural.facade;

public class FurnitureConstructor {

    public boolean createFurniture(WindowPlan plan) {
        if(plan.getProfileName().isEmpty()) {
            return false;
        }
        else {
            System.out.println("Created furniture for profile " + plan.getProfileName());
            return true;
        }
    }

}
