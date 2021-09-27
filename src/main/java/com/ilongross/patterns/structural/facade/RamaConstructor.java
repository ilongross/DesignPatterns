package com.ilongross.patterns.structural.facade;

public class RamaConstructor {

    public boolean createRama(WindowPlan plan) {
        if(plan.getWidth() > 0 && plan.getHeight() > 0) {
            System.out.println("Created rama sized " + plan.getHeight() + ":" + plan.getWidth());
            return true;
        }
        else
            return false;
    }


}
