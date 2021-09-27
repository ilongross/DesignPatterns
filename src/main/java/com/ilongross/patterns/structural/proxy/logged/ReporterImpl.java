package com.ilongross.patterns.structural.proxy.logged;

import java.util.Random;

public class ReporterImpl implements Reporter{


    @Override
    public String makeReport(int times) throws InterruptedException {
        var sb = new StringBuilder();
        var rand = new Random();

        for (int i = 0; i < times; i++) {
            Thread.sleep(rand.nextInt(2000));

            sb.append(rand.nextInt(1000));
        }

        return sb.toString();
    }
}
