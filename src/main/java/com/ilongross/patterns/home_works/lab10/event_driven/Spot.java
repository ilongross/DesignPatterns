package com.ilongross.patterns.home_works.lab10.event_driven;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

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
