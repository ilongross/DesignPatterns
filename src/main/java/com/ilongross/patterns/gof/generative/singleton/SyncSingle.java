package com.ilongross.patterns.gof.generative.singleton;

public class SyncSingle {

    private static SyncSingle instance;

    private SyncSingle() {
    }

    public static synchronized SyncSingle getInstance() {
        if(instance == null) {
            instance = new SyncSingle();
        }
        return instance;
    }

}
