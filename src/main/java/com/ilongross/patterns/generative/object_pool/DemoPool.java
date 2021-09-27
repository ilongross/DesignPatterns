package com.ilongross.patterns.generative.object_pool;

public class DemoPool {
    public static void main(String[] args) {

        for (int i = 0; i < 30; i++) {

            var thread = new Thread(()-> {
                try {
                    var resource = ConnectionPoolGrowLimit.getConnectionResourceFromPool();
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
