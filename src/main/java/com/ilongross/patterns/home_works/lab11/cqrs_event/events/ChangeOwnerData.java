package com.ilongross.patterns.home_works.lab11.cqrs_event.events;

import com.ilongross.patterns.cqrs_event.event_sourcing.EventData;

public class ChangeOwnerData extends EventData {

    private final String newOwner;

    public ChangeOwnerData(String newOwner) {
        this.newOwner = newOwner;
    }

    public String getNewOwner() {
        return newOwner;
    }
}
