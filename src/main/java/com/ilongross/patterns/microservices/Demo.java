package com.ilongross.patterns.microservices;

import java.util.Random;

public class Demo {
    public static void main(String[] args) throws Exception {
        var rs = new ReportService();

        var rand = new Random();
        while(true) {
            Thread.sleep(100);
            var service = ServiceMonitor.gerRandomService();
            System.out.println(service);
            var  result = ExceptionHandler
                    .makeProblemRequest(service, rand.nextInt(100) + "");
            System.out.println(result);
        }
    }
}
