package com.ilongross.patterns.delivery;

import java.util.UUID;

public class DemoDeliveryMessages {
    public static void main(String[] args) {
        var receiver = new Receiver();
        var agent = new Agent(receiver);
        var sender = new Sender(agent);

        while(true) {
            sender.sendMessage(new Message(UUID.randomUUID(), System.currentTimeMillis() + ""));
        }
    }
}
