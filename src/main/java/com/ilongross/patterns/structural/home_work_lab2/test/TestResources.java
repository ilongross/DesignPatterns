package com.ilongross.patterns.structural.home_work_lab2.test;

public class TestResources {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            var thread = new Thread(() -> {
                try {
                    MyConnectionResource resource = ResourcesPool.getResourceFromPool();
                    resource.runProcess();
                    ResourcesPool.returnResourceToPool(resource);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            thread.start();
        }
    }
}
