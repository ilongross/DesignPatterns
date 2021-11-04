package com.ilongross.patterns.gof.generative.singleton;

public class MyUseHolder {

    private MyUseHolder() {
    }

    public static MyUseHolder getInstance() {
        return InstanceHolder.instance;
    }

    private static class InstanceHolder {
        public static MyUseHolder instance = new MyUseHolder();
    }

}
