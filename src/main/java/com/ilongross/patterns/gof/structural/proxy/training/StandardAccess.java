package com.ilongross.patterns.gof.structural.proxy.training;

import java.util.Random;
import java.util.UUID;

public class StandardAccess implements ActualAccess{

    private int[] tokens = {10, 11, 12};

    @Override
    public int getActualToken() {
        var rand = new Random();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return tokens[rand.nextInt(tokens.length)];
    }
}
