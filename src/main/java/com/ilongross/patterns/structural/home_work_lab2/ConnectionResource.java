package com.ilongross.patterns.structural.home_work_lab2;

import java.util.Random;

public class ConnectionResource {


    private static int id = 0;
    private int resourceId = ++id;
    private boolean isUsed = false;

    public void work() {
        try {
            System.out.println("Start working of thread " + Thread.currentThread().getName() + "\tID=" + resourceId);
            Thread.sleep(new Random().nextInt(2000));
            System.out.println("End working of thread " + Thread.currentThread().getName() + "\t\tID=" + resourceId);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int getResourceId() {
        return resourceId;
    }

    public void setIsUsed() {
        isUsed = true;
    }

    public boolean isUsed() {
        return isUsed;
    }
}
