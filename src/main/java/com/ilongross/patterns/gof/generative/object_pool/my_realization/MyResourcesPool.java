package com.ilongross.patterns.gof.generative.object_pool.my_realization;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyResourcesPool {

    private List<MyResource> resourcesList = Collections.synchronizedList(new ArrayList<>());
    private int capacity;

    public MyResourcesPool(int capacity) {
        this.capacity = capacity;
        initResources();
    }

    private synchronized void initResources () {
        for (int i = 0; i < capacity; i++) {
            resourcesList.add(new MyResource());
        }
    }

    public MyResource getResourceFromPool() throws Exception {
        if(resourcesList.size() > 0) {
            MyResource tr = resourcesList.get(resourcesList.size() - 1);
            resourcesList.remove(resourcesList.size() - 1);
            return tr;
        }
        else {
            int waitIterations = 0;
            while(resourcesList.size() == 0) {
                if(waitIterations == 3)
                    return new MyResource();
                ++waitIterations;
                Thread.sleep(1000);
                System.out.print(".");
            }
            System.out.println("list.size()=" + resourcesList.size());
            return getResourceFromPool();
        }
    }

    public void returnResourceToPool(MyResource returnable) {
        if(returnable.getId() > capacity)
            return;
        resourcesList.add(returnable);
    }

    private Stream<MyResource> getResourcesStream() {
        return resourcesList.parallelStream();
    }

    @Override
    public String toString() {
        return getResourcesStream()
                .sorted().map(r -> r.getId() + "")
                .collect(Collectors.joining(", ", "[", "]"));
    }

}
