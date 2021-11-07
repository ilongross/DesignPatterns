package com.ilongross.patterns.gof.behavioral.chain_of_responsibility.training;

public class User {

    private String name;
    private String function;
    private String pass;

    public User(String name, String function, String pass) {
        this.name = name;
        this.function = function;
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public String getFunction() {
        return function;
    }

    public String getPass() {
        return pass;
    }


}
