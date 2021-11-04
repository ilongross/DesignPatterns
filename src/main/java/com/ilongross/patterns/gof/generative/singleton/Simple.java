package com.ilongross.patterns.gof.generative.singleton;

public class Simple {

    public static final Simple instance = new Simple();

    private Simple() {
    }
//
//    public static Simple getInstance() {
//        return instance;
//    }

}
