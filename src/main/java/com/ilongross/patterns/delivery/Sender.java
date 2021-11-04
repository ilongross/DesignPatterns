package com.ilongross.patterns.delivery;

public class Sender {
    private Agent agent;

    public Sender(Agent agent) {
        this.agent = agent;
    }

    public void sendMessage(Message message) {
        System.out.println("Sending message " + message);
    }

    public Agent getAgent() {
        return agent;
    }

}
