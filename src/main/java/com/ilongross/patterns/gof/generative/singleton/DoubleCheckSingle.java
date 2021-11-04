package com.ilongross.patterns.gof.generative.singleton;

public class DoubleCheckSingle extends ParentWithProperty{

    private static volatile DoubleCheckSingle instance;

    private DoubleCheckSingle() {
    }

    public static DoubleCheckSingle getInstance() {
        DoubleCheckSingle localInstance = instance;
        if(localInstance == null) {
            synchronized (DoubleCheckSingle.class) {
                localInstance = instance;
                if(localInstance == null) {
                    instance = new DoubleCheckSingle();
                }
            }
        }
        return instance;
    }


}
