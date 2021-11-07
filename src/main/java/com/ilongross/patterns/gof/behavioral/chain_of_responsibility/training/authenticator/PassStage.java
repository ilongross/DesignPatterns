package com.ilongross.patterns.gof.behavioral.chain_of_responsibility.training.authenticator;

import com.ilongross.patterns.gof.behavioral.chain_of_responsibility.training.User;

class PassStage extends CheckPass{

    private final String pass = "123qwe";

    @Override
    public boolean check(User user) {
        if(user.getPass().equals(pass)) {
            return super.checkNextStage(user);
        } else {
            System.out.println("Wrong password.");
            return false;
        }
    }
}
