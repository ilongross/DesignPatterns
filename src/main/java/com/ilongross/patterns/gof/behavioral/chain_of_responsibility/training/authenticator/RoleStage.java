package com.ilongross.patterns.gof.behavioral.chain_of_responsibility.training.authenticator;

import com.ilongross.patterns.gof.behavioral.chain_of_responsibility.training.User;

class RoleStage extends CheckPass{

    private final String checkedFunction = "<admin>";

    @Override
    public boolean check(User user) {
        if(user.getFunction().equals(checkedFunction)) {
            return super.checkNextStage(user);
        } else {
            System.out.println("Wrong user role.");
            return false;
        }
    }
}
