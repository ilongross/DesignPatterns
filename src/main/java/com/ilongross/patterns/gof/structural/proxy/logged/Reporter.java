package com.ilongross.patterns.gof.structural.proxy.logged;

public interface Reporter {

    String makeReport(int times) throws InterruptedException;

}
