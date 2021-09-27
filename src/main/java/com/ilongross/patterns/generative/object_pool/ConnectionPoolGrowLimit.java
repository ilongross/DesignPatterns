package com.ilongross.patterns.generative.object_pool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ConnectionPoolGrowLimit {

    private static List<ConnectionResource> resourceList = new ArrayList<>();
    private static AtomicInteger capacity = new AtomicInteger(10);


    static {
        for (int i = 0; i < 10; i++) {
            resourceList.add(new ConnectionResource());
        }
    }

    public static ConnectionResource getConnectionResourceFromPool() throws Exception {

        if(resourceList.size() > 0) {
            ConnectionResource resource = resourceList.get(resourceList.size() - 1);
            resourceList.remove(resourceList.size() - 1);
            return resource;
        }
        else
            if(capacity.getAndDecrement() > 0) {
                return new ConnectionResource();
            }
            else {
                Thread.sleep(1000);
                return getConnectionResourceFromPool();
                }

    }

    public static void returnConnectionResourceToPool(ConnectionResource resource) {
        resourceList.add(resource);
    }


}
