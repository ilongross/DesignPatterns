package com.ilongross.patterns.microservices.event_driven;

import java.util.HashSet;
import java.util.Set;

public class Search {

    private Set<SearchUser> searchUserSet = new HashSet<>();
    private KafkaImitator kafkaImitator;

    public Search(KafkaImitator kafkaImitator) {
        this.kafkaImitator = kafkaImitator;
        var thread = new Thread(()-> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            var event = kafkaImitator.readForConsumer(this.toString());
            for (SearchUser user : searchUserSet) {
                if(event.getUserId() == user.getId()) {
                    user.setAge(event.getNewAge());
                    searchUserSet.add(user);
                }
            }
        });
        thread.start();
    }

    public Set<SearchUser> getSearchUserSet() {
        return searchUserSet;
    }
}
