package com.ilongross.patterns.microservices;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ServiceMonitor {
    private static List<ReportService> reportServiceList = new ArrayList<>();
    private static Random rand = new Random();

    static {
        for (int i = 0; i < 10; i++) {
            reportServiceList.add(new ReportService());
        }
        var thread = new Thread(() -> {
            try {
                Thread.sleep(700);
                for (ReportService service : reportServiceList) {
                    if (service.getErrorChance() >= 10) {
                        reportServiceList.remove(service);

                        Thread.sleep(100);
                        reportServiceList.add(new ReportService());
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread.start();
    }

    public static ReportService gerRandomService() {
        return reportServiceList.get(rand.nextInt(10));
    }

}
