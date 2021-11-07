package com.ilongross.patterns.gof.behavioral.chain_of_responsibility.training;

import com.ilongross.patterns.gof.behavioral.chain_of_responsibility.training.authenticator.NameRolePassAuth;

public class DemoChain {
    public static void main(String[] args) {

        var user = new User("Ilon", "<admin>", "123qwe");
        var auth = new NameRolePassAuth();
        auth.authenticate(user);

    }
}