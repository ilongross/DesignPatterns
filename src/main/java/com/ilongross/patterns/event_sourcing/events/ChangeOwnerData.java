package com.ilongross.patterns.event_sourcing.events;

import com.ilongross.patterns.event_sourcing.EventData;

public class ChangeOwnerData extends EventData {

    private final String newOwner;

    public ChangeOwnerData(String newOwner) {
        this.newOwner = newOwner;
    }

    public String getNewOwner() {
        return newOwner;
    }
}
