package com.ilongross.patterns.home_works.lab10.event_driven;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KafkaImitator {

    private List<SpotEvent> events = new ArrayList<>();
    private Map<String, Integer> consumerReadMap = new HashMap<>();

    public void populateEvent(SpotEvent event) {
        events.add(event);
    }

    public SpotEvent readForConsumer(String consumerId) {
        int readPosition;
        if(consumerReadMap.containsKey(consumerId)) {
            int lastReadPosition = consumerReadMap.get(consumerId);
            consumerReadMap.put(consumerId, ++lastReadPosition);
            readPosition = lastReadPosition;
        } else {
            consumerReadMap.put(consumerId, 0);
            readPosition = 0;
        }
        return events.get(readPosition);
    }

    public void showEvents() {
        events.stream().forEach(System.out::println);
    }

}
