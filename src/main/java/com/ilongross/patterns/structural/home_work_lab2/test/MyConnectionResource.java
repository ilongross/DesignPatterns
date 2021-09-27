package com.ilongross.patterns.structural.home_work_lab2.test;

public class MyConnectionResource {

    private static int idCounter = 0;
    private int id;

    public MyConnectionResource() {
        this.id = setId();
    }

    public void runProcess() {
        try {
            System.out.print("start process " + id + " ");
            for (int i = 0; i < 3; i++) {
                Thread.sleep(500);
                System.out.print(".");
            }
            Thread.sleep(500);
            System.out.println();
            System.out.println("stop process " + id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private int setId() {
        return ++idCounter;
    }

}
