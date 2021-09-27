package com.ilongross.patterns.structural.proxy.cashed_proxy;

import java.util.Random;

public class SearchImpl implements Search{

    private String source;

    public SearchImpl(String source) {
        this.source = source;
    }

    @Override
    public boolean find(String phrase) throws InterruptedException {
        Thread.sleep(new Random().nextInt(3000));

        return source.contains(phrase);
    }
}
