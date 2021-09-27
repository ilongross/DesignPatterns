package com.ilongross.patterns.structural.proxy.logged;

public class CounterReporterProxy implements Reporter{

    private Reporter reporter;

    public CounterReporterProxy(Reporter reporter) {
        this.reporter = reporter;
    }

    @Override
    public String makeReport(int times) throws InterruptedException {
        long startTime = System.currentTimeMillis();

        String result = reporter.makeReport(times);

        System.out.println("Method costs ms " + (System.currentTimeMillis() - startTime));
        return result;
    }
}
