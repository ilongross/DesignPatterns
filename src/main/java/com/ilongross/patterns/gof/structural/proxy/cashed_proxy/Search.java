package com.ilongross.patterns.gof.structural.proxy.cashed_proxy;

public interface Search {
    boolean find(String phrase) throws InterruptedException;
}
