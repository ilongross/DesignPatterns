package com.ilongross.patterns.generative.object_pool.my_realization;

public class MyResource implements Runnable, Comparable{

    private static int idCounter = 0;
    private int id;

    public MyResource() {
        this.id = ++idCounter;
    }

    @Override
    public void run() {
        System.out.println("Starts №" + id);
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Ended №" + id);
    }

    public int getId() {
        return id;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    @Override
    public String toString() {
        return "MyResource{" +
                "id=" + id +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if(this.getId() < ((MyResource) o).getId())
            return -1;
        else
            if(this.getId() > ((MyResource)o).getId())
                return 1;
            return 0;
    }
}
