package com.ilongross.patterns.gof.behavioral.observer;

public interface Publisher {
    void registerSubscriber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscriber);
    void notifyAllSubscribers();
}
