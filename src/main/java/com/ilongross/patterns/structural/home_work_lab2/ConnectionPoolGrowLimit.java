package com.ilongross.patterns.structural.home_work_lab2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ConnectionPoolGrowLimit {

    private static int minLimit = 10;

    private static boolean isDescSize = false;
    private static double boundForReturnMinSize = 0.7 * minLimit;

    private static List<ConnectionResource> resourceList = new ArrayList<>();
    private static AtomicInteger capacity = new AtomicInteger(minLimit);


    static {
        for (int i = 0; i < minLimit; i++) {
            resourceList.add(new ConnectionResource());
        }
    }

    public synchronized static ConnectionResource getConnectionResourceFromPool() throws Exception {
        System.out.println("List SIZE before GET resource: " + resourceList.size());

        if((double)resourceList.size() < boundForReturnMinSize)
            isDescSize = true;

        if(resourceList.isEmpty()) {
            capacity = new AtomicInteger(minLimit);
        }

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

    public synchronized static void returnConnectionResourceToPool(ConnectionResource resource) {
        if(resourceList.size() < minLimit)
            resourceList.add(resource);

        if((double)resourceList.size() > boundForReturnMinSize && isDescSize == true) {

            capacity = new AtomicInteger(0);
        }

        System.out.println("List SIZE after resource RETURN: " + resourceList.size());

    }


}
