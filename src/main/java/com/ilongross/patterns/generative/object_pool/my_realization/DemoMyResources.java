package com.ilongross.patterns.generative.object_pool.my_realization;

public class DemoMyResources {
    public static void main(String[] args) {
        var pool = new MyResourcesPool(10);

        for (int i = 0; i < 500; i++) {
            var thread = new Thread(() -> {
               try {
                   MyResource resource = pool.getResourceFromPool();
                   resource.run();
                   pool.returnResourceToPool(resource);
               } catch (Exception e) {
                   e.printStackTrace();
               }
            });
            thread.start();
        }
        var resultThread = new Thread(() ->  {
            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(pool);
            System.out.println(MyResource.getIdCounter());
        });
        resultThread.start();

    }
}
