package com.ilongross.patterns.structural.home_work_lab2;

public class DemoPool {
    public static void main(String[] args) {

        for (int i = 0; i < 20; i++) {

            var thread = new Thread(()-> {
                try {
                    ConnectionResource resource = ConnectionPoolGrowLimit.getConnectionResourceFromPool();
                    resource.work();
                    ConnectionPoolGrowLimit.returnConnectionResourceToPool(resource);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
            thread.start();
        }
    }
}
