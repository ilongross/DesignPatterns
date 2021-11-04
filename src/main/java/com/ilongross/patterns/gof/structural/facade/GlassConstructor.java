package com.ilongross.patterns.gof.structural.facade;

public class GlassConstructor {

    public void createGlass(WindowPlan plan) {
        if(plan.getGlassType().isEmpty()) {
            return;
        }
        else {
            System.out.println("Glass " + plan.getGlassType() + " added");
        }
    }

}
