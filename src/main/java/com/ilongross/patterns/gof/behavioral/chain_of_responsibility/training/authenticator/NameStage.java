package com.ilongross.patterns.gof.behavioral.chain_of_responsibility.training.authenticator;

import com.ilongross.patterns.gof.behavioral.chain_of_responsibility.training.User;

class NameStage extends CheckPass{

    private final String checkedName = "Ilon";

    @Override
    public boolean check(User user) {
        if(user.getName().equals(checkedName)) {
            return super.checkNextStage(user);
        } else {
            System.out.println("Wrong username");
            return false;
        }
    }
}
