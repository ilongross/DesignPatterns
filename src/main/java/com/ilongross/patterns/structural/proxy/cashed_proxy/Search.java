package com.ilongross.patterns.structural.proxy.cashed_proxy;

public interface Search {
    boolean find(String phrase) throws InterruptedException;
}
