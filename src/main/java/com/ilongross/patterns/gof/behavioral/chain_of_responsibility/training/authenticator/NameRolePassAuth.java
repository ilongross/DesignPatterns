package com.ilongross.patterns.gof.behavioral.chain_of_responsibility.training.authenticator;

import com.ilongross.patterns.gof.behavioral.chain_of_responsibility.training.User;

public class NameRolePassAuth implements Authenticator{

    private final NameStage nameStage = new NameStage();
    private final RoleStage roleStage = new RoleStage();
    private final PassStage passStage = new PassStage();

    public NameRolePassAuth() {
        nameStage.setNextStage(roleStage);
        roleStage.setNextStage(passStage);
        passStage.setNextStage(null);
    }

    @Override
    public boolean authenticate(User user) {
        return nameStage.check(user);
    }


}
