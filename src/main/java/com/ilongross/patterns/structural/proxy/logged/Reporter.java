package com.ilongross.patterns.structural.proxy.logged;

public interface Reporter {

    String makeReport(int times) throws InterruptedException;

}
