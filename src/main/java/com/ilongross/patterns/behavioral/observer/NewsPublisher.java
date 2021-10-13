package com.ilongross.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsPublisher implements Publisher{

    private List<Subscriber> subscriberList = new ArrayList<>();
    private String name;

    public NewsPublisher(String name) {
        this.name = name;
    }

    @Override
    public void registerSubscriber(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscriberList.remove(subscriber);
    }

    @Override
    public void notifyAllSubscribers() {
        subscriberList.forEach(s -> s.update(name + ", the time is " + System.currentTimeMillis()));
    }
}
