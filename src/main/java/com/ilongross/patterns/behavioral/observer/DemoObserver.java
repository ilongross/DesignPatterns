package com.ilongross.patterns.behavioral.observer;

public class DemoObserver {
    public static void main(String[] args) throws InterruptedException {
        var foxNews = new NewsPublisher("FOX news");
        var cnn = new NewsPublisher("CNN");

        var spectator1 = new Spectator("spectator1");
        var spectator2 = new Spectator("spectator2");
        var spectator3 = new Spectator("spectator3");
        var spectator4 = new Spectator("spectator4");
        var spectator5 = new Spectator("spectator5");

        foxNews.registerSubscriber(spectator1);
        foxNews.registerSubscriber(spectator2);
        foxNews.registerSubscriber(spectator3);

        cnn.registerSubscriber(spectator4);
        cnn.registerSubscriber(spectator5);

        for (int i = 0; i < 100; i++) {
            Thread.sleep(1000);

            if(i == 49) {
                foxNews.removeSubscriber(spectator3);
                cnn.registerSubscriber(spectator3);
            }
            if(i == 70) {
                foxNews.registerSubscriber(spectator5);
            }

            foxNews.notifyAllSubscribers();
            cnn.notifyAllSubscribers();
        }

    }
}
