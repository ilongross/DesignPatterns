package com.ilongross.patterns.structural.home_work_lab2.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ResourcesPool {

    private static List<MyConnectionResource> resourcesList = Collections.synchronizedList(new ArrayList<>());
    private static int capacity = 10;

    {
        for (int i = 0; i < capacity; i++) {
            resourcesList.add(new MyConnectionResource());
        }
    }

    public static MyConnectionResource getResourceFromPool() throws InterruptedException {
        if(!resourcesList.isEmpty()) {
            MyConnectionResource resource = resourcesList.get(resourcesList.size() - 1);
            resourcesList.remove(resourcesList.size() - 1);
            return resource;
        }
        return null;
    }

    public static void returnResourceToPool(MyConnectionResource resource) {
        resourcesList.add(resource);
    }

}
