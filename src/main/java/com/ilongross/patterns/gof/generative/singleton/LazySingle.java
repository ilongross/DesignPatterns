package com.ilongross.patterns.gof.generative.singleton;

public class LazySingle {

    private static LazySingle instance;

    private LazySingle() {
    }

    public static LazySingle getInstance() {
        if(instance == null) {
            instance = new LazySingle();
        }
        return instance;
    }

}
