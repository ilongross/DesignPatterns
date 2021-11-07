package com.ilongross.patterns.gof.behavioral.chain_of_responsibility.training.authenticator;

import com.ilongross.patterns.gof.behavioral.chain_of_responsibility.training.User;

public abstract class CheckPass {

    public CheckPass nextStage;

    public void setNextStage(CheckPass nextStage) {
        this.nextStage = nextStage;
    }

    public abstract boolean check(User user);

    protected boolean checkNextStage(User user) {
        if(nextStage == null) {
            System.out.println("Success authentication.");
            return true;
        } else {
            return nextStage.check(user);
        }
    }

}
