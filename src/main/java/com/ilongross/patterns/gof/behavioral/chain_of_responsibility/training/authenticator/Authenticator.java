package com.ilongross.patterns.gof.behavioral.chain_of_responsibility.training.authenticator;


import com.ilongross.patterns.gof.behavioral.chain_of_responsibility.training.User;

public interface Authenticator {

    boolean authenticate(User user);

}
