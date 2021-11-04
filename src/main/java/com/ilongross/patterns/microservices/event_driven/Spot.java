package com.ilongross.patterns.microservices.event_driven;

import java.util.*;

public class Spot {
    private Set<SpotUser> spotUserList = new HashSet<>();
    private KafkaImitator kafkaImitator;

    public Spot(KafkaImitator kafkaImitator) {
        this.kafkaImitator = kafkaImitator;
    }

    public void add(SpotUser user) {
        spotUserList.add(user);
        kafkaImitator.populateEvent(new SpotSearchEvent(user.getId(), UUID.randomUUID(), user.getAge()));
    }

}
