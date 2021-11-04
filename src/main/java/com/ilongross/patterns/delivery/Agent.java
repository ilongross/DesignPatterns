package com.ilongross.patterns.delivery;

import java.util.Random;

public class Agent {
    private Receiver receiver;
    private Random rand = new Random();

    public Agent(Receiver receiver) {
        this.receiver = receiver;
    }

    public void atLeastOnce(Message message) {
        while(rand.nextInt(3) != 1) {
            receiver.receive(message);
        }
    }

    public void atMostOnce(Message message) {
        for (int i = 0; i < 5; i++) {
            if(rand.nextInt(3) == 1) {
                receiver.receive(message);
                break;
            }
        }
    }

    public void exactlyOnce(Message message) {
        System.out.println("exactly-once");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        receiver.receive(message);
    }

}
